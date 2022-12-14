/*
 * Given an array of integers. Find the Inversion Count in the array. 

Inversion Count: For an array, inversion count indicates 
how far (or close) the array is from being sorted. 
If array is already sorted then the inversion count is 0.
 If an array is sorted in the reverse order then the inversion count is the maximum. 
Formally, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.

Input: N = 5, arr[] = {2, 4, 1, 3, 5}
Output: 3
Explanation: The sequence 2, 4, 1, 3, 5 
has three inversions (2, 1), (4, 1), (4, 3).
 */

import java.util.Arrays;

public class CountInversion_86 {
    public static void main(String[] args) {
        long[] arr={5,4,3,2,1};
        System.out.println(count(arr, arr.length));
        System.out.println(Arrays.toString(arr));
    }

    public static long count(long[] arr,int n){
        return MergeSort(arr,0,n-1);
    }

    public static long MergeSort(long[] arr,int left,int right){
        long count=0;
        if (left<right) {
            int mid=left+(right-left)/2;

           count+= MergeSort(arr, left, mid);
           count+= MergeSort(arr, mid+1, right);

           count+=Merge(arr,left,mid+1,right);

        }
        return count;
    }

    public static long Merge(long[] arr,int l,int m,int r){
        long count =0;

        int i=l;
        int j=m;

        int k=0;
        long[] ans=new long[r-l+1];

        while (i<m && j<=r) {
            if (arr[i]<=arr[j]) {
                ans[k]=arr[i];
                i++;
            } else {
                ans[k]=arr[j];
                count+=m-i;
                j++;
            }
            k++;
        }
        while (i<m) {
            ans[k]=arr[i];
            i++;
            k++;
           
        }

        while (j<=r) {
            ans[k]=arr[j];
            j++;
            k++;
            
        }

        for (int n = 0; n < ans.length; n++) {
            arr[l+n]=ans[n];
        }


        return count;
    }
}