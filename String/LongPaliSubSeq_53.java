/*
 * 516. Longest Palindromic Subsequence

Given a string s, find the longest palindromic subsequence's length in s.

A subsequence is a sequence that can be derived from another sequence 
by deleting some or no elements without changing the order of the remaining elements.

Example 1:

Input: s = "bbbab"
Output: 4
Explanation: One possible longest palindromic subsequence is "bbbb".
Example 2:

Input: s = "cbbd"
Output: 2
Explanation: One possible longest palindromic subsequence is "bb".
 */

public class LongPaliSubSeq_53 {
    public static void main(String[] args) {
        String str="aaaaa";
        System.out.println(calculate1(str.toCharArray()));
    }

    public static int calculate1(char []str){
        int n=str.length;
        int[][] dp=new int[n][n];
        
        for(int i=0;i<n;i++){
            dp[i][i]=1;
        }
        
        for(int l=1;l<n;l++){
            for(int i=0;i<n-l;i++){
                int j=i+l;
                if(l==1){
                    if(str[i]==str[j]){
                    dp[i][j]=2;
                    }
                    else{
                        dp[i][j]=1;
                    }
                }
                else if(str[i]==str[j]){
                    dp[i][j]=1+j-i-1+dp[i+1][j-1];
                }
                else{
                    dp[i][j]=1;
                }
            }
        }
        int s1=0;
        int s2=0;
        for (int i = 0; i < n; i++) {
            s1+=dp[0][i];
            s2+=dp[i][n-1];
        }
        return Math.max(s1, s2);
    }

    public static int calculate(char []str){
        int n=str.length;
        int[][] dp=new int[n][n];
        
        for(int i=0;i<n;i++){
            dp[i][i]=1;
        }
        
        for(int l=1;l<n;l++){
            for(int i=0;i<n-l;i++){
                int j=i+l;
                if(l==1 && str[i]==str[j]){
                    dp[i][j]=2;
                }
                else if(str[i]==str[j]){
                    dp[i][j]=2+dp[i+1][j-1];
                }
                else{
                    dp[i][j]=Math.max(dp[i][j-1],dp[i+1][j]);
                }
            }
        }
        
        return dp[0][n-1];
    }
}