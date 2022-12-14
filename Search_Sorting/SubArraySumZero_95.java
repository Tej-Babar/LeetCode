/*
 * You are given an array arr[] of size n.
 *  Find the total count of sub-arrays having their sum equal to 0.


 */


import java.util.HashMap;

public class SubArraySumZero_95 {

    public static void main(String[] args) {
        long arr[]={-5,-3,0,0,5,3,-4,2,-1};
        System.out.println(findSubarray(arr, arr.length));
    }
    public static long findSubarray(long[] arr ,int n) 
    {
        HashMap<Long,Integer> hm=new HashMap<>();
        long ans=0;
        long[] presum=new long[n];
        presum[0]=arr[0];
        hm.put(presum[0], 1);
        for (int i = 1; i < n; i++) {
            presum[i]=arr[i]+presum[i-1];
           
            hm.put(presum[i], hm.getOrDefault(presum[i], 0)+1);
        }

        for (long l : hm.keySet()) {
            int val=hm.get(l);
          
            if (l==0) {
                ans+=val+val*(val-1)/2;
            }
            else{
                ans+=val*(val-1)/2;
            }
        }

        

        return ans;
    }
}