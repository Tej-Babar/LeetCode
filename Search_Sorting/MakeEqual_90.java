/*
 * Given an array which contains integer values,
 *  we need to make all values of this array equal to some integer value with minimum 
 * cost where the cost of changing an array value x to y is abs(x-y). 


 */

public class MakeEqual_90 {
    public static void main(String[] args) {
        int a[] = {4,6 };
        int n = a.length;
        System.out.println(Cost(a, n));
    }

    public static int Cost(int[] arr,int n){
        int res=0;
        int k;
        if (n%2!=0) {
            k=arr[n/2];
        }
        else{
            k=(arr[n/2]+arr[(n-2)/2])/2;

        }

        for (int i : arr) {
            res+=Math.abs(i-k);
        }
        return res;
    }
}
