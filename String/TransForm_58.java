/*
 * Transform One String to Another using Minimum Number of Given Operation
 * 
 * Given two strings A and B,
 *  the task is to convert A to B if possible.
 *  The only operation allowed is to put any character from A and insert it at front. 
 * Find if it’s possible to convert the string.
 *  If yes, then output minimum no. of operations required for transformation.

Examples: 

Input:  A = "ABD", B = "BAD"
Output: 1
Explanation: Pick B and insert it at front.

Input:  A = "EACBD", B = "EABCD"
Output: 3
Explanation: Pick B and insert at front, EACBD => BEACD
             Pick A and insert at front, BEACD => ABECD
             Pick E and insert at front, ABECD => EABCD
 */

import java.util.Arrays;

public class TransForm_58 {
    public static void main(String[] args) {
        String A = "GEEKSFORGEEKS" ;
        String B = "FORGEEKSGEEKS";
        System.out.println(transfigure(A, B));
    }
     static int transfigure (String A, String B)
    {
        if (A.length()!=B.length()) {
            return -1;
        }
        char[] a=A.toCharArray();
        char[] b=B.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0; i < b.length; i++) {
            if (a[i]!=b[i]) {
                return -1;
            }
        }
       
        int op=0;
        int p1=A.length()-1;
        int p2=B.length()-1;
        while(p1>=0){
            if(A.charAt(p1)!=B.charAt(p2)){
                op++;
            }
            else{
                p2--;
            }
            p1--;
        }
        return op;

    }
}
