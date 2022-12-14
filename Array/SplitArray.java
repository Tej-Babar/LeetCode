public class SplitArray {
    public static void main(String[] args) {
        int nums[]={1,2,3,3,4,5};
        System.out.println(isPossible(nums));
    }
    public static boolean isPossible(int[] nums) {
        int l=nums.length;
        int max=1;
        int nmax=0,i=1;
        int cur=nums[0];

        while(i<l) {
            cur=nums[i];nmax=0;
            if(nums[i-1]+1!=cur) return false;
            while (i<l && cur==nums[i]) {
                i++;
                nmax++;
            }
            if (nmax<max) {
                System.out.println(i);
                return false;
            }
            else{
                max=nmax;
            }
        }
        int la=l-1;
        int mid=l-1-max;
        int f=mid-max;

        if(nums[f]+1==nums[mid] && nums[mid]+1==nums[la]) return true;
        return false;
    }
}
