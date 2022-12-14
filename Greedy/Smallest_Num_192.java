/*
 * The task is to find the smallest number with given sum of digits as S and number 
 * of digits as D.
Example 1:

Input:
S = 9 
D = 2
Output:
18
Explanation:
18 is the smallest number
possible with sum = 9
and total digits = 2.
 */

public class Smallest_Num_192 {
    public static void main(String[] args) {
        System.out.println(smallestNumber(20, 3));
    }
    static String smallestNumber(int S, int D){
        StringBuilder sb=new StringBuilder();
        int n=S/9;
        if(S%9!=0) n++;
        if(n>D) return "-1";
    
        while (D>0) {
   
            if (D==1) {
                sb.append(S);
            }
            else{
                if (S>9) {
                    sb.append(9);
                    S-=9;
                }
                else if(S>1){
                    sb.append(S-1);
                    S=1;
                }
                else{
                    sb.append(0);
                }
            }

            D--;
        }
       
        return sb.reverse().toString();
    }
}
