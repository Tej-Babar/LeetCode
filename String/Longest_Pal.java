/*
 * 2131. Longest Palindrome by Concatenating Two Letter Words
 * You are given an array of strings words. Each element of words consists of 
 * two lowercase English letters.

Create the longest possible palindrome by selecting some elements from words 
and concatenating them in any order. Each element can be selected at most once.

Return the length of the longest palindrome that you can create. 
If it is impossible to create any palindrome, return 0.

A palindrome is a string that reads the same forward and backward.
 */

public class Longest_Pal {

    public static void main(String[] args) {
       String words[]= {"dd","aa","bb","dd","aa","dd","av"};
       System.out.println(longestPalindrome(words));
    }
    public static int longestPalindrome(String[] words) {
        int dp[][]=new int[26][26];
        int i,j,m1,m2;
        for (String s : words) {
            i=s.charAt(0)-'a';
            j=s.charAt(1)-'a' ;
            dp[i][j]+=1;
        }
        
        int res=0;
        for (i=0;i<26;i++) {
            for(j=i;j<26;j++){
                if(i==j) continue;
                m1=dp[i][j];
                m2=dp[j][i];
                if(m1<m2){
                    res+=m1*4;
                }
                else{
                    res+=m2*4;
                }
            }
        }
     
        boolean f=false;
        for (int k = 0; k < 26; k++) {
            int e=dp[k][k];
            if(e>0 && e%2==0){
                res+=e*2;
            }
            else if(e>0){
                f=true;
                res+=(e-1)*2;
            }
        }
        if(f)
        res+=2;
        return res;



    }
}