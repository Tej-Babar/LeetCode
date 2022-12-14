/*
    1328. Break a Palindrome
 * Given a palindromic string of lowercase English letters palindrome, 
 * replace exactly one character with any lowercase English letter so that the resulting 
 * string is not a palindrome and that it is the lexicographically smallest one possible.

Return the resulting string. If there is no way to replace a character to make it not a 
palindrome, return an empty string.

*/

public class BrakePalindrome {
    public static void main(String[] args) {
        String s="abccba";
        System.out.println(breakPalindrome(s));

    }

    public static String breakPalindrome(String s) {
        char ch='a';
        int len=s.length();
        if(len==1) return "";
        int index=-1;
        for (int i = 0; i <len/2 ; i++) {
            if(s.charAt(i)>ch){
                index=i;
                break;
            }
        }
        if(index==-1){
            String ans=s.substring(0,len-1)+'b';
            return ans;
        }
        if(index!=-1){
            String ans=s.substring(0,index)+'a'+s.substring(index+1);
            return ans;
        }
        return "";

        
    }
}