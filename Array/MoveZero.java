/* 283. Move Zeroes
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.
 */

import java.util.Arrays;

public class MoveZero {
    public static void main(String[] args) {
        int nums[] = {0,1,0,3,1,0,9,6};
        moveZeroes(nums);
    }

    public  static void moveZeroes(int[] nums) {
        int c=0,p=0;
        int len=nums.length;

        while (p<len && c<len) {
            while (p<len && nums[p]!=0) {
                p++;
            }
            while (c<len && nums[c]==0) {
                c++;
            }
            if(p<c && c<len){
               nums[p]=nums[c];
               nums[c]=0;
               p++;
               c++;
            }
            else{
                c++;
            }

        }

        System.out.println(Arrays.toString(nums));
    }
}
