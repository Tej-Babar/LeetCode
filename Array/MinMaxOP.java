public class MinMaxOP {
    public static void main(String[] args) {
        int[] nums = {2,10,7,5,4,1,8,6};
        System.out.println(minimumDeletions(nums));
    }

    public static int minimumDeletions(int[] nums) {
        int res =0;
        int min=nums[0];
        int max=nums[0];
        int i=0,j=0;

        for (int j2 = 1; j2 < nums.length; j2++) {
            if (min>nums[j2]) {
                i=j2;
                min=nums[j2];
            }
            if (max<nums[j2]) {
                j=j2;
                max=nums[j2];
            }
        }


        max=i>j?i:j;
        min=i<j?i:j;

     

        if (min+1<nums.length-max) {
            res+=min+1;
            res+=Math.min(nums.length-max, max-min);
        }
        else{
            res+=nums.length-max;
            res+=Math.min(min+1, max-min);
        }

        return res;
    }
}
