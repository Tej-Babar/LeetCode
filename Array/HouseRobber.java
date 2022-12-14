public class HouseRobber {
    public static void main(String[] args) {
        int nums[]={9,6,5,1};
        System.out.println(rob(nums));
    }

    public static int rob(int[] nums) {
        
        int n = nums.length;
        
        if(n == 1) return nums[0];
        
        int dp2=nums[0], dp1=Math.max(nums[0],nums[1]),dp=dp1;
        
        for(int i = 2; i < n; i++){
            dp = Math.max(dp1, dp2 + nums[i]);
            dp2 = dp1;
            dp1 = dp;
        }
        return dp;

    }
}

    

    