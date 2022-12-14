/*Suppose an array of length n sorted in ascending order is rotated between 1 and n times.
 For example, the array nums = [0,1,2,4,5,6,7] might become:

[4,5,6,7,0,1,2] if it was rotated 4 times.
[0,1,2,4,5,6,7] if it was rotated 7 times. */

public class MinRotetedArray_25 {
    public static void main(String[] args) {
        int nums[]={6,7,8,2,3,4};
        System.out.println(findMin(nums));
    }
    public static int findMin(int[] nums) {
        int index=pivet(nums);
        int l=nums.length;
        if(nums[0]<nums[l-1]){
            return nums[0];
        }
        else
            return nums[(index+1)%l];
        
    }
     public static int pivet(int[] arr){
        int s=0;
        int e=arr.length-1;
      
        int ans=s;
        int pivot=arr[ans];
        while (s<e) {
            int m=(s+e)/2;

            if (pivot<arr[m] ) {
                s=m;
                ans=m;
                pivot=arr[m];
            }
            
            else{
                e=m;
            }
 
        }
        
        return ans;
      
    }
}


