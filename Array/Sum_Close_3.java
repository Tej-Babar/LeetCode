/*
 * Given an integer array nums of length n and an integer target, 
 * find three integers in nums such that the sum is closest to target.

Return the sum of the three integers.

You may assume that each input would have exactly one solution.
 */
import java.util.Arrays;

public class Sum_Close_3 {
    public static void main(String[] args) {
        int nums[] = {-1,2,1,-4};
        int target=1;
        System.out.println(threeSumClosest(nums, target));
    }

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res=nums[0]+nums[1]+nums[2];
       

        for (int i = 0; i < nums.length-2; i++) {
           int left = i + 1, right = nums.length - 1;

            while(left<right){
                int sum = nums[left]+nums[right] + nums[i];
                if(Math.abs(target-sum) < Math.abs(target-res)) res = sum;
                if(sum == target) return sum;
                if(sum > target) right--;
                else left++;
            }

        
        }

        return res;

    }
}