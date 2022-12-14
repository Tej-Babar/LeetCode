/*
   80. Remove Duplicates from Sorted Array II
 * Given an integer array nums sorted in non-decreasing order,
 *  remove some duplicates in-place such that each unique element appears at most twice.
 *  The relative order of the elements should be kept the same.
 * 
 */

import java.util.Arrays;

public class RemoveD2 {
    public static void main(String[] args) {
        int nums[]={0,0,1,1,1,1,2,3,3};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int put=1;

        for (int i = 1; i < nums.length; i++) {
            int temp=nums[i-1];
            int c=0;
            while (i<nums.length && nums[i]==temp) {
                i++;
                c++;
            }
            if (c>=1) {
                nums[put]=temp;
                put++;
            }
            if (i<nums.length) {
                nums[put]=nums[i];
                put++;
            }

        }

        System.out.println(Arrays.toString(nums));
      
        return put;
    }
}
