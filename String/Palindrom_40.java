/*A phrase is a palindrome if,
 after converting all uppercase letters into lowercase letters 
 and removing all non-alphanumeric characters, it reads the same forward and backward.
  Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

 

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome. */
public class Palindrom_40 {
    public static void main(String[] args) {
        String  s = "0p";
        //System.out.println(s.charAt(29));
        System.out.println(isPalindrome(s));
    }
    public  static boolean isPalindrome(String str) {
       
      str=str.toLowerCase();
      int i =0;
     int j=str.length()-1;
     while (i < j) {
         char charI = str.charAt(i);
         char charJ = str.charAt(j);
         if (!(charI >= 'a' && charI <= 'z' || charI >= '0' && charI <= '9')) {
             i++;     
         } else if (!(charJ >= 'a' && charJ <= 'z' || charJ >= '0' && charJ <= '9')){
             j--;
         } else if (charI != charJ) {
             return false;
         } else {
             i++;
             j--;
         }
     }
     return true;
 }
}