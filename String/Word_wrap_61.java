import java.util.Arrays;

public class Word_wrap_61 {
    public static void main(String[] args) {
        int[] nums={3,2,2,5};
        int k=6;
        System.out.println(solveWordWrap(nums, k));
    }

    public static int solveWordWrap (int[] nums, int k)
    {
        Arrays.fill(dp, -1);
        return rec(0,k,nums,k);
    }
    static int[][] dp=new int[505][2005];
    
    public static int rec(int i,int rem,int[] arr,int k){
        if (i==arr.length) {
            return 0;
        }
      
        if(dp[i][rem]!=-1) return dp[i][rem];
        int ans;
        if (arr[i]<=rem) {
            int c1=rec(i+1, rem-arr[i]-1, arr, k);
            int c2= (rem+1)*(rem+1) + rec(i+1, k-arr[i]-1, arr, k);
            ans= Math.min(c1, c2);

        }
        else{
            ans= (rem+1)*(rem+1) + rec(i+1, k-arr[i]-1, arr, k);
        }

        dp[i][rem]=ans;
        return dp[i][rem];
    }
}
