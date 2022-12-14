/*
 * Remove Consecutive Characters
 * Given a string S.
 *  For each index i(1<=i<=N-1), erase it if s[i] is equal to s[i-1] in the string.

Example 1:

Input:
S = aabb
Output:  ab 
Explanation: 'a' at 2nd position is
appearing 2nd time consecutively.
Similiar explanation for b at
4th position.

 */
public class RemoveCos_43 {
    public static void main(String[] args) {
        String S = "aabaad";
        System.out.println(removeConsecutiveCharacter(S));
    }

    public static String removeConsecutiveCharacter(String S){
        String ans="";
        int i=0;
        for (i = 0; i <S.length()-1; i++) {
            char f=S.charAt(i);
            char s=S.charAt(i+1);

            if (!(f==s)) {
                ans+=f;
            }
        }
        ans+=S.charAt(i);
        return ans;
    }
    
}
