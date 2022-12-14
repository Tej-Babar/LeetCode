public class MaxSumSubarray_14 {

    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums) {
        int len=nums.length;
        if(len==0){
            return 0;
        }
        int maxsum=nums[0];
        int csum=0;
        for(int i=0;i<len;i++){
            csum=csum+nums[i];
            
            if(csum>maxsum){
                maxsum=csum;
            }
            if(csum<0){
                csum=0;
            }
        }
        
        return maxsum;
        
    }
}