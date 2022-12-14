/*
    Palindromic Substring 

 * Given a string s, return the number of palindromic substrings in it.

A string is a palindrome when it reads the same backward as forward.

A substring is a contiguous sequence of characters within the string.

Input: s = "abc"
Output: 3
Explanation: Three palindromic strings: "a", "b", "c".
 */

public class PalSubCount_51 {
    public static void main(String[] args) {
        String s="aaa";
        System.out.println(countSubstrings(s));
    }
    public static int countSubstrings(String s) {
        int c=0;
        for (int i = 0; i < s.length(); i++) {
            c+=count(s, i, i);
            c+=count(s, i, i+1);
        }
        return c;
    }
    public static int count(String s,int st,int en){
        int c=0;
        while ((st>=0 && en<s.length()) && (s.charAt(st)==s.charAt(en))) {
            c++;
            st--;
            en++;
        }
        return c;
    }
}
