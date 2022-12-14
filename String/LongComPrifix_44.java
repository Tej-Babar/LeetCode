import java.util.HashSet;

/*
 * Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
 */

public class LongComPrifix_44 {
    public static void main(String[] args) {
        String[] strs={"aa","aa"};
        System.out.println(longestCommonPrefix(strs));
    }
    public static String longestCommonPrefix(String[] strs) {

        int minimumLength = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            minimumLength = Math.min(minimumLength, strs[i].length());
        }
       // System.out.println(minimumLength);

        StringBuilder ans=new StringBuilder();
        HashSet<Character> hs=new HashSet<>();
        for (int i = 0; i < minimumLength; i++) {
            for (int j = 0; j < strs.length; j++) {
                char c=strs[j].charAt(i);
                hs.add(c);
                if (hs.size()!=1) {
                    return ans.toString();
                }
                else if (j==strs.length-1) {
                 ans.append(c);
                 hs.remove(c);
                }
            }
        }

        return ans.toString();

    }
    public String longestCommonPrefix1(String[] strs) {
      
        
        StringBuilder longestCommonPrefix = new StringBuilder();
       
        if (strs == null || strs.length == 0) {
            return longestCommonPrefix.toString();
        }
       
        int minimumLength = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            minimumLength = Math.min(minimumLength, strs[i].length());
        }
        
        for (int i = 0; i < minimumLength; i++) {
           
            char current = strs[0].charAt(i);
           
            for (String str : strs) {
                if (str.charAt(i) != current) {
                    return longestCommonPrefix.toString();
                }
            }
            longestCommonPrefix.append(current);
        }
        return longestCommonPrefix.toString();
    }


}
