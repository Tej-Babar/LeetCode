import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindDuplicate_87 {
    public static void main(String[] args) {
        int[] arr={2, 3,1, 2, 3};
        ArrayList<Integer> list=duplicates1(arr, arr.length);
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }

    public static ArrayList<Integer> duplicates1(int arr[], int n) {
        ArrayList<Integer> list=new ArrayList<>();

       for (int i = 0; i < n; i++) {
           arr[arr[i] % n]
               = arr[arr[i] % n]
                 + n;
       }
       //System.out.println("The repeating elements are : ");
       for (int i = 0; i < n; i++) {
           if (arr[i] >= n * 2) {
               list.add(i);
           }
       }
        if (list.isEmpty()) {
           list.add(-1);
       }
       return list;
   }

    public static ArrayList<Integer> duplicates(int arr[], int n) {
        ArrayList<Integer> list=new ArrayList<>();

        for (int i = 0; i < n;) {
            int index=arr[i];
            if(!list.contains(index)){
            if (arr[index]!=arr[i]) {
                int temp=arr[index];
                arr[index]=arr[i];
                arr[i]=temp;
                //i++;
            }
            else{
                if (arr[i]!=i ) {
                    list.add(arr[i]);
                }
                i++;

            }
        }
        else i++;

        }
        System.out.println(Arrays.toString(arr));
       
        if (list.isEmpty()) {
            list.add(-1);
        }
        Collections.sort(list); 

        return list;
    }
}
