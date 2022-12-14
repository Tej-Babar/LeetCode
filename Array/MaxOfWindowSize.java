/*
239. Sliding Window Maximum
 * You are given an array of integers nums, there is a sliding window of size k which 
 * is moving from the very left of the array to the very right. You can only see the k 
 * numbers in the window. Each time the sliding window moves right by one position.

Return the max sliding window.
 */

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.PriorityQueue;


public class MaxOfWindowSize {
    public static void main(String[] args) {
        int nums[] = {1,3,-1,-3,5,3,6,7}, k = 3;
        System.out.println(Arrays.toString(maxSlidingWindow1(nums, k)));
    }

    public static int[] maxSlidingWindow1(int[] nums, int k) {
        int n=nums.length;

        int res[]=new int[n-k+1];
        int st=0;

        Deque<Integer> dqueue=new ArrayDeque<>();
      
        for (int i = 0; i < n; i++) {
            if(!dqueue.isEmpty() && dqueue.peek()==i-k) dqueue.pollFirst();

            while (!dqueue.isEmpty() && nums[dqueue.peekLast()]<nums[i]) {
                dqueue.pollLast();
            }
            dqueue.addLast(i);

            if(i>=k-1) res[st++]=nums[dqueue.peekFirst()];
        }

        return res;
    }



    public static int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int res[]=new int[n-k+1];

        PriorityQueue<Integer> pQueue=new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < k; i++) {
            pQueue.add(nums[i]);
        }
        int max=pQueue.peek();
        int j=k;
        for (int i = 0; i<n-k; i++) {
       
            max=pQueue.peek();
            res[i]=max;
            pQueue.remove(nums[i]);
            pQueue.add(nums[j]);
            j++;
        }
        res[n-k]=pQueue.peek();


        return res;

    }
}
