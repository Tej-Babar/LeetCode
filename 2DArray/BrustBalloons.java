/*
 * 452. Minimum Number of Arrows to Burst Balloons
 * 
 * Example 1:

Input: points = [[10,16],[2,8],[1,6],[7,12]]
Output: 2
Explanation: The balloons can be burst by 2 arrows:
- Shoot an arrow at x = 6, bursting the balloons [2,8] and [1,6].
- Shoot an arrow at x = 11, bursting the balloons [10,16] and [7,12].
 */

import java.util.Arrays;

public class BrustBalloons {
    public static void main(String[] args) {
        int[][] points={{10,16},{2,8},{1,6},{7,12}};
        System.out.println(findMinArrowShots(points));
    }

    public static int findMinArrowShots(int[][] points) {
        
        Arrays.sort(points,(a,b)->Integer.compare(a[1], b[1]));
        int max;
        int i=0, count=0,len=points.length;

        while (i<len) {
            max=points[i][1];
            count++;
            while (i<len && points[i][0]<=max) {
                i++;
            }

        }
     
        return count;
    }
}
