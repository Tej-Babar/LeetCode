/*
 * Given a pattern and a string s, find if s follows the same pattern.

Here follow means a full match, such that there is a bijection between
 a letter in pattern and a non-empty word in s.

Example 1:

Input: pattern = "abba", s = "dog cat cat dog"
Output: true
Example 2:

Input: pattern = "abba", s = "dog cat cat fish"
Output: false
 */
import java.util.HashMap;

public class Word_pat {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";
        System.out.println(wordPattern(pattern, s));
    }
    public static boolean wordPattern(String pattern, String s) {
     
            HashMap<Character,String> h = new HashMap<>();

            char[] c = pattern.toCharArray();

            String[] sen = s.split(" ");

          //  String[] sen = ss;

            int n1=pattern.length();
            int n2=sen.length;

            if(n1!=n2){
             return false;
            }

            for(int i=0;i<n1;i++){
            if(h.containsKey(c[i])){

                if(!(h.get(c[i]).equals(sen[i]))){
                return false;
            }
            }
            else{
                if(h.containsValue(sen[i])){
                return false;
            }

                 h.put(c[i],sen[i]);

            }
            }

            return true;

        }
    }