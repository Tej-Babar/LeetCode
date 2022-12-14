/*
 * Given three arrays sorted in increasing order.
 *  Find the elements that are common in all three arrays.
Note: can you take care of the duplicates without using
 any additional Data Structure?
 
 */

import java.util.ArrayList;

public class CommonElement_78 {
    public static void main(String[] args) {
        int n1 = 6;int[] A = {1, 5, 10, 20, 40, 80};
        int n2 = 5;int[] B = {6, 7, 20, 80, 100};
        int n3 = 8;int[] C = {3, 4, 15, 20, 30, 70, 80, 120};
        ArrayList<Integer> list=commonElements(A, B, C, n1, n2, n3);
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
    static ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        ArrayList<Integer> list =new ArrayList<>(); 
        int a=0,b=0,c=0;
        while (a<n1 && b<n2 && c<n3) {
            if (A[a]==B[b] && B[b]==C[c]) {
                if (!list.contains(A[a])) {
                    
                    list.add(A[a]);
                }
                a++;
                b++;
                c++;
            }
            else{
            int max=Math.max(A[a], B[b]);
            max=Math.max(max, C[c]);

            while (a<n1 && A[a]<max) {
                a++;
            }
            while (b<n2 && B[b]<max) {
                b++;
            }
            while (c<n3 && C[c]<max) {
                c++;
            }
        }

        }

        return list;
    }
}
