/*
 *  Given an array of integers nums and an integer k,
 *  return the total number of subarrays whose sum equals to k.

A subarray is a contiguous non-empty sequence of elements within an array.
 */

import java.util.HashMap;

public class SubArrSumEK {
    public static void main(String[] args) {
        int arr[]={1,2,3,0,-3};
        int k=3;
        System.out.println(subarraySum(arr, k));
        
    }
    public static int subarraySum(int[] arr, int k) {

        int n=arr.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        int ans=0;
        int[] presum=new int[n];
        presum[0]=arr[0];
       
        for (int i = 1; i < n; i++) {
            presum[i]=arr[i]+presum[i-1];
           
        }
        for (int i = n-1; i >= 0; i--) {
            if (presum[i]==k) {
                ans++;
            }
            if (hm.containsKey(presum[i]+k)) {
                ans+=hm.get(presum[i]+k);
            }
            hm.put(presum[i], hm.getOrDefault(presum[i], 0)+1);
        }

       

        

        return ans;
    }
}