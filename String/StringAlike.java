/*
 * 1704
 * You are given a string s of even length. Split this string into two halves of equal 
 * lengths, and let a be the first half and b be the second half.

Two strings are alike if they have the same number of vowels 
('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). 
Notice that s contains uppercase and lowercase letters.

Return true if a and b are alike. Otherwise, return false
 */

public class StringAlike {
    public static void main(String[] args) {
        
    }
    public boolean halvesAreAlike(String s) {
        s=s.toLowerCase();
        int n=s.length();
       
        int c=0;
        for(int i=0;i<n/2;i++){
            char cr=s.charAt(i);
            if(cr=='a' || cr=='e' || cr=='i' || cr=='o' || cr=='u') c++;
            
        }

        for(int i=n/2;i<n;i++){
            char cr=s.charAt(i);
            if(cr=='a' || cr=='e' || cr=='i' || cr=='o' || cr=='u') c--;
        }

        return c==0;
        
    }
}