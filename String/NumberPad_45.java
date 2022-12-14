/*
 * Given a sentence in the form of a string in uppercase,
 *  convert it into its equivalent mobile numeric keypad sequence.


 */

public class NumberPad_45 {
    public static void main(String[] args) {
        String S = "H AB";
        System.out.println(printSequence(S));
    }
    static String printSequence(String S) 
    { 
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i)==' ') {
                sb.append(0);
            }
            else{
            int n=S.charAt(i)-'A';
            int num=(n/3)+2;
           
            int t=n%3;
            for (int j = 0; j <= t; j++) {
                sb.append(num);
            }

        }
    }
    
        return sb.toString();
    }
}
