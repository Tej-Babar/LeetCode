import java.util.Arrays;

public class CountSort_77 {
    public static void main(String[] args) {
        int[] arr={5,43,2,7,89,1,20,1};
        System.out.println(Arrays.toString(countSort(arr)));
    }

    public static int[] countSort(int[] arr){
        int n=arr.length;
        if (n<0) {
            return arr;
        }

        int k=arr[0];
        for (int i : arr) {
            k=Math.max(k, i);
        }

        int[] count=new int[k+1];

        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        for (int i = 1; i < count.length; i++) {
            count[i]+=count[i-1];
        }

        int[] ans=new int[n];

        for (int i = n-1; i >=0 ; i--) {
            ans[--count[arr[i]]]=arr[i];
        }
        return ans;
    }
}
