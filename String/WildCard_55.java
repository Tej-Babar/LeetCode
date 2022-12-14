/*
 * Wildcard Matching
 * Given an input string (s) and a pattern (p), 
 * implement wildcard pattern matching with support for '?' and '*' where:

'?' Matches any single character.
'*' Matches any sequence of characters (including the empty sequence).
The matching should cover the entire input string (not partial).

 

Example 1:

Input: s = "aa", p = "a"
Output: false
Explanation: "a" does not match the entire string "aa".
Example 2:

Input: s = "aa", p = "*"
Output: true
Explanation: '*' matches any sequence.
Example 3:

Input: s = "cb", p = "?a"
Output: false
Explanation: '?' matches 'c', but the second letter is 'a', which does not match 'b'.
 */

public class WildCard_55 {
    public static void main(String[] args) {
        String wild = "*";
        String pattern="aa";
        System.out.println(match(wild, pattern));
    }
    static boolean match(String wild, String pattern)
    {
        int wl=wild.length();
        int pl=pattern.length();
       boolean dp[][]=new boolean[wl+1][pl+1];

       for (int i = wl; i >=0; i--) {
        for (int j = pl; j >=0; j--) {
            if (i==wl && j==pl) {
                 dp[i][j]=true;
            }
            else if(i==wl){
                dp[i][j]=false;
            }
            else if(j==pl){
                if(wild.charAt(i)=='*')
                dp[i][j]=dp[i+1][j];
                else
                dp[i][j]=false;
            }
            else{
                if (wild.charAt(i)=='?') {
                    dp[i][j]=dp[i+1][j+1];
                }
                else if(wild.charAt(i)=='*') {
                    dp[i][j]=dp[i+1][j] || dp[i][j+1];
                }
                else{
                    if (wild.charAt(i)==pattern.charAt(j)) {
                        dp[i][j]=dp[i+1][j+1];
                    } else {
                        dp[i][j]=false;
                    }
                }
            }
            
        }

       }
       for (boolean[] bs : dp) {
        for (boolean bs2 : bs) {
            System.out.print(bs2+" ");
        }
        System.out.println();
       }
       System.out.println();
       return dp[0][0];
    }
}
