/*
 * Count triplets with sum smaller than X
 * 
 * Given an array arr[] of distinct integers of size N and a value sum,
 *  the task is to find the count of triplets (i, j, k),
 *  having (i<j<k) with the sum of (arr[i] + arr[j] + arr[k]) smaller than 
 *  the given value sum.
 */

import java.util.Arrays;

public class TripletSum_83 {
    public static void main(String[] args) {
        long[] arr = {5, 1, 3, 4, 7};
        System.out.println(countTriplets(arr, arr.length, 12));
    }
    static long countTriplets(long arr[], int n,int sum)
    {
        Arrays.sort(arr);
        long res=0;
        for (int i = 0; i < n-2; i++) {
            long a=arr[i];
            int s=i+1;
            int e=n-1;
            while (s<e) {
                while (s<e && sum<=a+arr[s]+arr[e]) {
                    e--;
                }
                res+=(e-s);
                s++;
            }

        }

        return res;
    }
}
