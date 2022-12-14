/*
 * Merge Without Extra Space
 * 
 * Given two sorted arrays arr1[] and arr2[] of sizes n and m
 *  in non-decreasing order. Merge them in sorted order without using any extra space.
 *  Modify arr1 so that it contains the first N elements and modify arr2 so that 
 * it contains the last M elements.
 */

import java.util.Arrays;

public class Merge_85 {
    public static void main(String[] args) {
        int[] arr2={3,4,5,6,7,8,76,78,89,90};
        int[] arr1={-1,2,2,6,8,10,12,35,67,68,69,70,78,79,788,888};
        Merge(arr1, arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
    public static void Merge(int[] arr1,int[] arr2){
      
        int n1=arr1.length;

        int n2=arr2.length;

        int cn=(n1+n2)/2;

        int n=(n1+n2)/2+(n1+n2)%2;
        while (cn>=1) {
            
            int s=0;
            int e=n;
         
            while (e<n1) {
                if (arr1[s]>arr1[e]) {
                    int temp=arr1[s];
                     arr1[s]=arr1[e];
                     arr1[e]=temp;

                    }
                  s++;
                  e++;
                }
            

            e=0;
            while (s<n1 && e<n2) {
                if (arr1[s]>arr2[e]) {
                    int temp=arr1[s];
                     arr1[s]=arr2[e];
                     arr2[e]=temp;

                }
                s++;
                e++;
            }

            s=0;
            while (e<n2) {
                if (arr2[s]>arr2[e]) {
                    int temp=arr2[s];
                     arr2[s]=arr2[e];
                     arr2[e]=temp;

                }
                s++;
                e++;
            }
            
            cn=n/2;
            n=(n/2)+(n%2);

        }

    }
}