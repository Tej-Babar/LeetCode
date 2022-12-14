import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*Given two strings s and t,
 return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed
 by rearranging the letters of a different word or phrase,
  typically using all the original letters exactly once.

 

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true */

public class Anagram_41 {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s, t));
    }

    public  static boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()) {
            return false;
        }
        char[] arr1=s.toCharArray();
        char[] arr2=t.toCharArray();
      
      Arrays.sort(arr1);
      Arrays.sort(arr2);
      
      for (int i = 0; i < arr2.length; i++) {
        if (arr1[i]!=arr2[i]) {
            return false;
        }

      }
      return true;
    }

    public  static boolean isAnagram1(String s, String t){
        Map<Character, Integer> frequency = new HashMap<>();

        for (char letter : s.toCharArray()) {
            frequency.put(letter, frequency.getOrDefault(letter, 0) + 1);
        }
        
        int remainingCount = 0;
        for (char letter : t.toCharArray()) {
            remainingCount = frequency.getOrDefault(letter, 0);
            if (remainingCount > 1) {
                frequency.put(letter, remainingCount - 1);
            } else if (remainingCount == 1) {
                frequency.remove(letter);    
            } else {
                return false;
            }
        }
        
        return frequency.size() == 0 ? true : false;
    }
}
    


