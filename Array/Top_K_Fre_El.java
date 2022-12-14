/*
347. Top K Frequent Elements
 * Given an integer array nums and an integer k, 
 * return the k most frequent elements. 
 * You may return the answer in any order
 */

import java.util.Arrays;
import java.util.HashMap;

public class Top_K_Fre_El {
    public static void main(String[] args) {
        int  nums[] = {1,1,1,2,2,3}, k = 2;
        System.out.println(Arrays.toString(topKFrequent1(nums, k)));
    }

    public static int[] topKFrequent1(int[] nums, int k) {
        int ans[]=new int[k];
        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int i : nums) {
            hm.put(i, hm.getOrDefault(i, 0)+1);

        }
        for(int i=0;i<k;i++){
            int key=0,val=0;
            for (int j : hm.keySet()) {
                if(hm.get(j)>val){
                    key=j;
                    val=hm.get(j);
                }
            }
            hm.put(key, 0);
            ans[i]=key;
        }

        return ans;
    }
    

    public static int[] topKFrequent(int[] nums, int k) {
        int list[]=new int[k];
        int p=0;

        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        // Finding max and from the array;
        for (int i = 0; i < nums.length; i++) {
        	max = Math.max(nums[i], max);
        	min = Math.min(nums[i], min);
        }
        // Storing the frequency in res

        int[] res = new int[max - min + 1];
        for (int i = 0; i < nums.length; i++) {
        	res[nums[i] - min]++;
        }
        
        for (int i = 0; i < k; i++) {
        	int ran = rank(res);
        	res[ran] = 0;
        	list[p]=ran + min;
            p++;
        }
        return list;
    }
    private static int rank(int[] res) {
    	int max = 0, index = 0;
    	for (int i = 0; i < res.length; i++) {
    		if (res[i] > max) {
    			index = i;
    			max = res[i];
    		}
    	}
        return index;
    }
}