/*Find if there is a pair with a given sum in the rotated sorted Array */

public class RotetedSort_29 {
    public static void main(String[] args) {
        int[] arr={10,15,20,25,30,34,36,37,38,86,86,86,86,1,2,3,4,6,7};
        System.out.println(pairInSortedRotated(arr,25));
    }
    static boolean pairInSortedRotated(int arr[],int x){
      
        int l=arr.length;
        
        int e1=pivet(arr);
        int s1=(e1+1)%l;

        while (s1!=e1) {
            
            if(arr[s1]+arr[e1]==x){
                System.out.println(arr[s1]);
                System.out.println(arr[e1]);
                return true;
            }
            else if(arr[s1]+arr[e1]<x){
                s1=(s1+1)%l;
            }
            else{
                e1=(e1-1)%l;
            }
        }
     



        return false;
    }

    static int pivet(int[] arr){
        int s=0;
        int e=arr.length-1;
        if(arr[s]<arr[e]){
            return e;
        }
        while (s<e) {
            int m=(s+e)/2;
            if (arr[s]<arr[m]) {
                s=m;
            }
            else if(arr[s]==arr[m]){
                if (s==e-1) {
                    return s;
                } else {
                    s=m;
                }
            }
            else{
                e=m;
            }

            
        }
        return e;
    }
}
