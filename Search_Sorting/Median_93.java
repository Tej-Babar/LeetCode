/*
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, 
 * return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n))
 */

public class Median_93 {
    public static void main(String[] args) {
        int[] arr1 = { 1,2 };
        int[] arr2 = { 3,4};
        System.out.println(Median(arr1, arr2));
    }

    public static double Median(int[] arr1,int arr2[]){
        int n1=arr1.length;
        int n2=arr2.length;
        int n=n1+n2;
        int i=0, j=0;
        int m1=0;
        int m0=0;
        int k=0;
        while (i<n1 && j<n2 && k<=(n/2) ) {
             m0=m1;
            if (arr1[i]<=arr2[j]) {
                m1=arr1[i];
                i++;
            }
            else{
               m1=arr2[j];
               j++;
            }
            k++;
        }
       //System.out.println(k);
        if (k<=(n/2)) {
            while (i<n1 && k<=(n/2)){
                m0=m1;
                m1=arr1[i];
                i++;
                k++;
            }
            while (j<n2 && k<=(n/2) ){
                m0=m1;
                m1=arr2[j];
               j++;
               k++;
            }
        }
        //System.out.println(m0+" "+m1);
        if (n%2==0) {
            double d=(double)(m0+m1)/2;
            return d;
        } else {
            return m1;
        }


    }
 
}
