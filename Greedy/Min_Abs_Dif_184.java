/*
 * You are given two arrays A and B of equal length N. 
 * Your task is to pair each element of array A to an element in array B, 
 * such that the sum of the absolute differences of all the pairs is minimum.
 */

import java.util.Arrays;

public class Min_Abs_Dif_184 {
    public static void main(String[] args) {
        
    }

    long findMinSum(int[] A,int[] B,int N) { 
        Arrays.sort(A);
        Arrays.sort(B);
        long res=0;
        for (int i = 0; i < N; i++) {
            res+=Math.abs(A[i]-B[i]);
        }

        return res;
    }
}
