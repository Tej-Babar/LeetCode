/*Given an array arr of distinct elements of size N, 
the task is to rearrange the elements of the array in a zig-zag fashion 
so that the converted array should be in the below form: 

arr[0] < arr[1]  > arr[2] < arr[3] > arr[4] < . . . . arr[n-2] < arr[n-1] > arr[n]. 

NOTE: In the mentioned complexity, only a unique solution will exist. */

import java.util.Arrays;

public class Zig_Zag {

    public static void main(String[] args) {
        int N = 7;
        int Arr[] = {4, 3, 7, 8, 6, 2, 1};
        zigZag(Arr, N);
        System.out.println(Arrays.toString(Arr));
    }

    static void zigZag(int arr[], int n) {
        for (int i = 1; i < n; i++) {
            if(i%2!=0 ){
                if (arr[i]<arr[i-1]) {
                    swap(arr, i, i-1);
                }
            }
            else{
                if (arr[i]>arr[i-1]) {
                    swap(arr, i, i-1);
                }
            }
        }
    }

    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}