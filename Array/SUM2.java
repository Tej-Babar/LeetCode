/*Given an array of integers nums and an integer target,
 return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution,
and you may not use the same element twice.

You can return the answer in any order. */

import java.util.Arrays;
import java.util.HashMap;

public class SUM2 {

    public static void main(String[] args) {
       int[] nums={2,7,11,15};
       int target=9;
       System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();

        int temp[]=new int[2];
        for(int i=0;i<nums.length;i++){
            int rem=target-nums[i];
            if (hashMap.containsKey(rem)) {
                temp[0]=hashMap.get(rem);
                temp[1]=i;
                return temp;
            }
            else{
                hashMap.put(nums[i], i);
            }
            
        }
        
      return temp;
    }

}
