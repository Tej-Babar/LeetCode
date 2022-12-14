/*
 * 424. Longest Repeating Character Replacement

You are given a string s and an integer k. 
You can choose any character of the string and change it to any other
 uppercase English character. You can perform this operation at most k times.

Return the length of the longest substring containing the same letter 
you can get after performing the above operations.

Example 1:

Input: s = "ABAB", k = 2
Output: 4
Explanation: Replace the two 'A's with two 'B's or vice versa.
 */

public class CharReplace_48 {
    public static void main(String[] args) {
        String s="GBABAACBADK";
        int k=2;
        System.out.println(characterReplacement(s, k));
    }
    public static int characterReplacement(String s, int k) {
        int ans=0;
        int n=s.length();
        
        int st=0;
        int en=0;
        
        int max=0;
        int[] arr=new int[26];
        
        while(en<n){
            char c=s.charAt(en);
            arr[c-'A']++;
            max=Math.max(max,arr[c-'A']);
            
            if(en-st+1-max>k){
                char d=s.charAt(st);
                arr[d-'A']--;
                st++;
            }
            
            ans=Math.max(ans,en-st+1);
            en++;
        }
        
        return ans;
    }
}
