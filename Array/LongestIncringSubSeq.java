import java.util.Arrays;

public class LongestIncringSubSeq {
    public static void main(String[] args) {
        
        int[] nums={7,7,7,1,2,3,7,7,7,8};
        System.out.println(lengthOfLIS(nums));
        
    }

    public static int lengthOfLIS1(int[] nums) {
        int[] dp=new int[nums.length+1];
        Arrays.fill(dp, -1);
        return Fun(Integer.MIN_VALUE,0,0,nums,dp);
    }
    public static int lengthOfLIS(int[] nums) {
        int[] minbefore=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int num=nums[i];
            minbefore[i]=1;
            for (int j = 0; j < i; j++) {
                if (num>nums[j] ) {
                    minbefore[i]=Math.max(minbefore[i],minbefore[j]+1 );
                }
            }
        }
        int max=minbefore[0];
        for (int i : minbefore) {
            
            max=max<i?i:max;
        }


        return max;
    }


    private static int Fun(int minValue, int index, int c,int[] arr,int[] dp) {
        if (index==arr.length) {
            dp[index]=c;
            return c;
        }
        int c1=0,c2=0;

        if (arr[index]>minValue) {
            c1=Fun(arr[index], index+1, c+1, arr,dp);
        }
        c2=Fun(minValue, index+1, c, arr,dp);
        dp[index]=Math.max(c1, c2);
        return Math.max(c1, c2);


    }
}
