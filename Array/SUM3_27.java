

/*
Given an integer array nums, return all the triplets
 [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, 
 and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.
*/
import java.util.Arrays;

import java.util.LinkedList;
import java.util.List;

public class SUM3_27 {
    public static void main(String[] args) {
        int[] nums={-1,0,1,2,-1,-4};
       
    }

    public  static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new LinkedList<>();
        int n=nums.length;
        for (int i = 0; i <n-2;i++) {
            
            if (i==0 || (i>0 && nums[i]!=nums[i-1])) {
                int lo=i+1,hi=n-1,sum=0-nums[i];

                while (lo<hi) {
                    if (nums[lo]+nums[hi]==sum) {
                        ans.add(Arrays.asList(nums[i],nums[lo],nums[hi]));
                        while (lo<hi && nums[lo]==nums[lo+1]) {
                            lo++;
                        }
                        while (lo<hi && nums[hi]==nums[hi-1]) {
                            hi--;
                        }
                        lo++;
                        hi--;
                    }

                    else if(nums[lo]+nums[hi]<sum){
                        lo++;
                    }
                    else{
                        hi--;
                    }
                }
            }
        }

        return ans;
            
        
      }
}
