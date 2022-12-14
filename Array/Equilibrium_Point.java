/*
 * Given an array A of n positive numbers. 
 * The task is to find the first Equilibium Point in the array. 
Equilibrium Point in an array is a position such that the sum of elements before 
it is equal to the sum of elements after it.
 */

public class Equilibrium_Point {
    public static void main(String[] args) {
        
    }

    public static int equilibriumPoint(long arr[], int n) {

        if(n==1){
            return 1;
        }
       int i=0;
        int j=n-1;
        long sum=0;
        while (i<j) {
            if (sum<0) {
                sum+=arr[i];
                i++;
            } else {
                sum-=arr[j];
                j--;
            }
            
        }
        
      

        if(sum==0) return i+1;
        else return -1;
    }
}