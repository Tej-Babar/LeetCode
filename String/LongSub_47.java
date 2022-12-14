import java.util.HashMap;
import java.util.HashSet;

/*
 * Given a string s, find the length of the longest substring without repeating characters.

Example 1:
Input: s = "abcabcbb"
Output: 3

Example 2:
Input: s = "bbbbb"
Output: 1

Example 3:
Input: s = "pwwkew"
Output: 3

 */

public class LongSub_47 {
    public static void main(String[] args) {
       String s = "pwwkew";
     //String s = "abcabcbxsyzts";
        System.out.println(lengthOfLongestSubstring1(s));
     
    }
    public static int lengthOfLongestSubstring1(String s) {
        int res=0;
        HashSet<Character> hs=new HashSet<>();
        int l=0;
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            while(hs.contains(c)) {
               hs.remove(s.charAt(l));
               l++;
            }
            hs.add(c);
            res=Math.max(res,i-l+1);
        }

        return res;
    }
     public static int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> hs=new HashMap<>();
        int maxlength=0;
        int len=0;
        int dptr=0;
       // int mf=0;
        for (int i = 0; i <s.length(); i++) {
            char c=s.charAt(i);
            if (!hs.containsKey(c)) {
                hs.put(c, i);
                len++;
            }
            else{
                maxlength=Math.max(maxlength,len);
                //len=i-hs.get(c)-1;
                int d=hs.get(c);
                for (int j = dptr; j <=d; j++) {
                    hs.remove(s.charAt(j));
                    len--;
                }
                dptr=d+1;
                i--;
                
            }
        }
        if (maxlength==0) {
            return s.length();
        }
        else{
            return Math.max(maxlength, len);
        }
    }
}