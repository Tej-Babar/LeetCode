/*Given an array A of positive integers. 
Your task is to find the leaders in the array. 
An element of array is leader if it is greater than or equal to all the 
    elements to its right side. The rightmost element is always a leader. 
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class leaderElement {
    public static void main(String[] args) {
        int A[] = {16,17,4,3,5,2};
        ArrayList<Integer> result = leaders(A, A.length);

        Iterator<Integer> it = result.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
            
        }
    }

    static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList<Integer> result = new ArrayList<>();

        int max = arr[n-1];
        result.add(max);
        for(int i=n-2;i>=0;i--)
        {
            if(arr[i] >= max)
            {
                result.add(arr[i]);
                max = arr[i];
            }
        }

        Collections.reverse(result);

        return result;
    }
}
