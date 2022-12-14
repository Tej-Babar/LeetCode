/*Given an integer array nums, find a contiguous non-empty subarray within the array that has the largest product, and return the product.

The test cases are generated so that the answer will fit in a 32-bit integer.

A subarray is a contiguous subsequence of the array.

 

Example 1:

Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6. */
public class MaxProSubArray_24 {
    public static void main(String[] args) {
        int[] nums={2,3,-2,4};
        System.out.println(maxProduct(nums));
    }

    public static int maxProduct(int[] nums) {
        int maxpro=nums[0];
        int cmax=1,cmin=1;
        
        for(int i : nums){
            if(i==0){
                cmax=1;
                cmin=1;
                maxpro=Math.max(maxpro,0);
                continue;
            }
            
            int temp=cmax*i;
            cmax=Math.max(cmax*i,cmin*i);
            cmax=Math.max(cmax,i);
            
             cmin=Math.min(temp,cmin*i);
            cmin=Math.min(cmin,i);
            
            maxpro=Math.max(cmax,maxpro);
            
            
            
        }
        
        return maxpro;
    }

}
