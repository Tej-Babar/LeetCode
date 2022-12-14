/*
 * 686. Repeated String Match

Given two strings a and b,
 return the minimum number of times you should repeat string a so that
  string b is a substring of it. If it is impossible for b​​​​​​ to be a substring of a
   after repeating it, return -1.

Notice: string "abc" repeated 0 times is "",
 repeated 1 time is "abc" and repeated 2 times is "abcabc".

 
Example 1:

Input: a = "abcd", b = "cdabcdab"
Output: 3
Explanation: We return 3 because by repeating a three times "abcdabcdabcd", b is a substring of it.
Example 2:

Input: a = "a", b = "aa"
Output: 2
 */
import java.util.HashSet;

public class RepeStringMatch {
    public static void main(String[] args) {
        String  a = "abcd", b = "cdabcdab";
        System.out.println(repeatedStringMatch(a, b));
    }

    public static int repeatedStringMatch(String a, String b) {


       HashSet<Character> hs=new HashSet<>();
       for (char c : b.toCharArray()) {
            hs.add(c);
       }
       for (char c : a.toCharArray()) {
        if (hs.contains(c)) {
            hs.remove(c);
        }
     }
     if (hs.size()!=0) {
        return -1;
    }
        int maxres=(b.length()*2)/a.length();
        StringBuilder sb=new StringBuilder();
        for (int i = 1; i <= maxres; i++) {
            sb.append(a);
            if (!(sb.length()<b.length())) {
                if (RabinKarp(sb.toString(), b)) {
                    return i;
                }
            }

        }

        return -1;
    }
    static boolean RabinKarp(String text,String pat){
        int m=text.length();
        int n=pat.length();

        int x=31;
        long x_m=1;
        long mod=1000000000;

        long t=0;
        long p=0;
        for (int i = 0; i < n-1; i++) {
            x_m=(x_m*x)%mod;
        }
        for (int i = 0; i < n; i++) {
            t=(t*x + text.charAt(i)-'a'+1)%mod;
            t=(t+mod)%mod;
            p=(p*x + pat.charAt(i)-'a'+1)%mod;
            p=(p+mod)%mod;
        }

        for (int i = 0; i <=m-n; i++) {
            if (p==t) {
                return true;
               
            }

            if(i<m-n){
                t=(x*(t-(text.charAt(i)-'a'+1)*(x_m)) +text.charAt(i+n)-'a'+1)%mod;
            }
            if (t<0) {
                t=(t+mod)%mod;
            }
        }
        return false;
    }
}


