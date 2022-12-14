/*Given an integer array nums and an integer k,
 return the number of non-empty subarrays that have a sum divisible by k.

A subarray is a contiguous part of an array.

 

Example 1:

Input: nums = [4,5,0,-2,-3,1], k = 5
Output: 7
Explanation: There are 7 subarrays with a sum divisible by k = 5:
[4, 5, 0, -2, -3, 1], [5], [5, 0], [5, 0, -2, -3], [0], [0, -2, -3], [-2, -3] */

public class SubarraySum_35 {

    public static void main(String[] args) {
        int[] nums = {4,5,0,-2,-3,1};
        int k=5;
        System.out.println(subarraysDivByK(nums, k));
    }
    public  static int subarraysDivByK(int[] nums, int k) {
        int len=nums.length;
         int[] rem=new int[k];
        int sum=0;
        for(int i=0;i<len;i++){
            sum+=nums[i];
            int r=((sum%k)+k)%k;
            rem[r%k]++;
        }
        
        int res=rem[0];
        for(int i=0;i<rem.length;i++){
            int c=rem[i];
            res+=c*(c-1)/2;
        }
        return res;
    }
}