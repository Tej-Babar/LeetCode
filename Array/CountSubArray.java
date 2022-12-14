/*
 * Given an array of N positive integers  Arr1, Arr2 ............ Arrn. 
 * The value of each contiguous subarray of given array is the maximum element 
 * present in that subarray. The task is to return the number of subarrays having 
 * value strictly greater than K.
 */

public class CountSubArray {
    public static void main(String[] args) {
        int arr[]={3,2,1};
        System.out.println(countSubarray(arr, 3, 2));
    }

    static long countSubarray(int arr[], int n, int k) {

        int st=0;
        long sum=0;
        int left,right,ans;
        for(int i=0;i<n;i++){
            
            if(arr[i]>k){
        
                left=i-st;
                right=n-i-1;
               
                ans=left+right+(left*right)+1;
                
                sum+=ans;
                st=i+1;
            }
            
            
        }
        
        return sum;
    }
}
