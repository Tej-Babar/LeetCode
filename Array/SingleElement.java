/*
 * You are given a sorted array consisting of only integers 
 * where every element appears exactly twice,
 *  except for one element which appears exactly once.

Return the single element that appears only once.

Your solution must run in O(log n) time and O(1) space.

Example 1:
Input: nums = [1,1,2,3,3,4,4,8,8]
Output: 2
 */

public class SingleElement {

    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(nums));
        
    }
    public static int singleNonDuplicate(int[] nums) {
        int l=nums.length;
        if(l==1){
            return nums[0];
        }
        int s=0;
        int e=l-1;
        while(s<e){
            int m=(s+e)/2;
            int p=m-1;
            int n=m+1;
            
            if(nums[m]!=nums[p] && nums[m]!=nums[n]) return nums[m];
            
            int len=m-s;
            if(len%2==0){
                if(nums[m]==nums[p]) e=p-1;
                else s=n+1;
            }
            else{
                if(nums[m]==nums[n]) e=p;
                else s=n;
            }
        }
        
        
        return nums[s];
        
        
    }
    

}