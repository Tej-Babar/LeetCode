/*
 * Given an array a[ ] of N elements. Consider array as a circular array 
 * i.e. element after an is a1. The task is to find maximum sum of the absolute difference 
 * between consecutive elements with rearrangement of array elements allowed 
 * i.e. after any rearrangement of array elements 
 * find |a1 – a2| + |a2 – a3| + …… + |an-1 – an| + |an – a1|.
 */

import java.util.Arrays;

public class Swap_max_193 {
    public static void main(String[] args) {
        
    }

    long maxSum(long arr[] ,int n)
    {
    
        long res=0;
        Arrays.sort(arr);
        int i=0,j=n-1;

        boolean f=true;
        while (i<j) {
            res+=Math.abs(arr[i]-arr[j]);
            if(f){
                i++;
                f=false;
            }
            else{
                j--;
                f=true;
            }
        }

        res+=Math.abs(arr[0]-arr[j]);

        return res;
        
    }
}
