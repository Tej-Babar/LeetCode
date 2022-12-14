import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class abc {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();

        while (T>0) {
            int n=sc.nextInt();
            int arr[] = new int[n];

            arr[0]=sc.nextInt();
            int max=arr[0];
            for (int i = 1; i < n; i++) {
                int k=sc.nextInt();
                arr[i]=k;
                if (k>max) {
                    max=k;
                }
            }

            int ans=Fun(max,arr);
            System.out.println(ans);
            
            T--;
        }

    }

    private static int Fun(int max, int[] arr) {
        int mod=(int) (Math.pow(10, 9)+7);
        int dp[] = new int[max+1];
        dp[1]=1;
        for (int i = 2; i < dp.length; i++) {
            dp[i]=(dp[i-1]*i)%mod;
        }

        int ans=0;

        for (int i = 0; i < arr.length; i++) {
            ans=(ans+(dp[arr[i]])%mod)%mod;
        }

        return ans%mod;
    }

    static int Fun(int[] arr){
        int mod=998244353;
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=(sum+arr[i]);
        }

        return (sum*(sum-1))%mod;
    }

}