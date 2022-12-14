/*
Maximum and minimum of an array using minimum number of comparisons
*/


public class MIn_Max {

    public static void main(String[] args) {
        int[] arr={2,5,1,8,2,0,3,6,-2,12};
        Pair ans=getMinMax1(arr, 10);
        System.out.println(ans.min+" "+ans.max);
    }

    static class Pair{
        int min;
        int max;
    }

    public static Pair getMinMax1(int[] arr,int n) {
        Pair pair=new Pair();
        int MAX,MIN;
        if (n==0) {
            return null;
        }
        else{
            MAX=arr[0];
            MIN=arr[0];
        }

        for (int i = 1; i <n; i++) {
            if (arr[i]>MAX) {
                MAX=arr[i];
            }
            else if (arr[i]<MIN) {
                MIN=arr[i];
            }
        }
        pair.max=MAX;
        pair.min=MIN;
        return pair;
        
    }

  


}
