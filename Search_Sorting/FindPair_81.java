/*
 * Given an array Arr[] of size L and a number N,
 *  you need to write a program to find if there exists a pair of elements in the array
 *  whose difference is N.
 */


import java.util.Arrays;
import java.util.HashSet;


public class FindPair_81 {
    public static void main(String[] args) {
        
        int arr[] = {1, 2, 6, 3, 4};
                    // 1,2,3,4,6
        System.out.println(findPair1(arr, arr.length, 0));
    }

    public static boolean findPair1(int arr[], int size, int n)
    {
        Arrays.sort(arr);
        int i=0;
        int p=1;
        while (i<size && p<size) {
            
            while (p<size && arr[p]<arr[i]+n) {
                p++;
            }
            if (p<size && i!=p && arr[i]+n==arr[p]) {
                return true;
            }
            i++;
            
        }
      
        return false;
    }

    public static boolean findPair(int arr[], int size, int n)
    {
        Arrays.sort(arr);
        HashSet<Integer> hs=new HashSet<>();
        hs.add(arr[size-1]);
        for (int i = size-2; i >= 0; i--) {
            int dif=n+arr[i];
            if (hs.contains(dif)) {
                return true;
            }
            else hs.add(arr[i]);
        }

        return false;
    }
}
