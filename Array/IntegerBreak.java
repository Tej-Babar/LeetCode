/*
 * 343 IntegerBreak
 * Given an integer n, break it into the sum of k positive integers,
 *  where k >= 2, and maximize the product of those integers.

Return the maximum product you can get.
 */

public class IntegerBreak {
    public static void main(String[] args) {
        System.out.println(integerBreak(8));
    }

    public static int integerBreak(int n) {
        if(n<=3) return n-1;
        int res=1;

        while (n>=5) {
            res*=3;
            n-=3;
        }
        if(n!=0) res*=n;

        return res;
    }
}