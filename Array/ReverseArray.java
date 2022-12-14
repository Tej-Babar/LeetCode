/*
Write a program to reverse an array or string

*/
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        Reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Reverse(int[] arr){
        int l=arr.length;
        for (int i = 0; i < l/2; i++) {
            int temp=arr[i];
            arr[i]=arr[(l-1)-i];
            arr[(l-1)-i]=temp;
        }

    }
}
