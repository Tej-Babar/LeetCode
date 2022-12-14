/*Merge Overlapping Intervals
 * Input: Intervals = {{1,3},{2,4},{6,8},{9,10}}
Output: {{1, 4}, {6, 8}, {9, 10}}
Explanation: Given intervals: [1,3],[2,4],[6,8],[9,10], 
we have only two overlapping intervals here,[1,3] and [2,4]. 
Therefore we will merge these two and return [1,4],[6,8], [9,10].

Input: Intervals = {{6,8},{1,9},{2,4},{4,7}}
Output: {{1, 9}} 
 */

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

public class MergeInterval_31 {
    public static void main(String[] args) {
        int[][] Intervals={{6,8},{1,9},{2,4},{2,7}};
        
        
    }

    public int[][] merge(int[][] intervals) {
        List<int[]> ans=new ArrayList<>();

        if (intervals.length==0 || intervals==null) {
            return ans.toArray(new int[0][]);
        }

        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int start=intervals[0][0];
        int end=intervals[0][1];

        for (int[] is : intervals) {
            if (is[0]<=end) {
                end=Math.max(end, is[1]);
            } else {
                ans.add(new int[]{start,end});
                start=is[0];
                end=is[1];
            }
        }
        ans.add(new int[]{start,end});

        return ans.toArray(new int[0][]);
    }
}