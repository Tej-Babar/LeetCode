/*
 * You may recall that an array arr is a mountain array if and only if:

arr.length >= 3
There exists some index i (0-indexed) with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
Given an integer array arr, return the length of the longest subarray, 
which is a mountain. Return 0 if there is no mountain subarray.

 */

public class LongMountain {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,0};
        System.out.println(longestMountain(arr));
    }

    public static int longestMountain(int[] arr) {
        int res=0;
        int ans=0;
        int len=arr.length;
        if(len<3) return 0;
        int temp;
        boolean f=false;
        temp=arr[0];
        int i=1;
        while (i<len) {
            f=false;ans=1;
            while (i<len && temp<arr[i]) {
                temp=arr[i];
                i++;
                ans++;
                f=true;
            }
            temp=arr[i-1];
            while (i<len && f && temp>arr[i]) {
                ans++;
                temp=arr[i];
                i++;
                if(ans>res) res=ans;
            }
            if(!f) i++;
            temp=arr[i-1];
        }

        if(res<3) return 0;
        return res;
    }
}
