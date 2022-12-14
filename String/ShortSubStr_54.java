/*
 * Smallest window in a string containing all the characters of another string
 * Given two strings S and P. 
 * Find the smallest window in the string S consisting of 
 * all the characters(including duplicates) of the string P. 
 *  Return "-1" in case there is no such window present.
 *  In case there are multiple such windows of same length,
 *  return the one with the least starting index. 

Example 1:

Input:
S = "timetopractice"
P = "toc"
Output: 
toprac
Explanation: "toprac" is the smallest
substring in which "toc" can be found.
 */

import java.util.HashMap;

public class ShortSubStr_54 {
    public static void main(String[] args) {
       String S = "ADOBECODEBANC";
       String P = "ABC";
       System.out.println(smallestWindow(S, P));
    }
    public static String smallestWindow(String s, String p)
    {
        HashMap<Character,Integer> hs=new HashMap<>();
        HashMap<Character,Integer> fr=new HashMap<>();
        for (char c : p.toCharArray()) {
            hs.put(c,hs.getOrDefault(c, 0)+1);
        }
        
        int st=0;
        int en=0;
        int j=0;
        int count=p.length();
        int c=0;
        String ans="";
        for (int i = 0; i < s.length(); i++) {
          
            char cr=s.charAt(i);
            fr.put(cr,fr.getOrDefault(cr, 0)+1);
            if (hs.containsKey(cr)) {

                if(fr.get(cr)<=hs.get(cr)){
                    c++;
                }
            }
            if (c==count) {
                en=i;
                while (j<=i) {
                    char remove=s.charAt(j);
                    fr.replace(remove, fr.get(remove)-1);
                    st=j;
                    j++;
                    if(hs.containsKey(remove)){
                    if(fr.get(remove)<hs.get(remove)){
                        c--;
                        break;
                    }
                }
                }
                String nans=s.substring(st,en+1);
              
                if (ans.length()>nans.length() || ans=="") {
                    ans=nans;
                }
                
            }
        }
        return ans;
    }
}
