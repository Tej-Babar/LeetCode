/*Searching in an array where adjacent differ by at most k

 * A step array is an array of integer where each element has a difference
 *  of at most k with its neighbor. Given a key x,
 *  we need to find the index value of x if multiple elements exist,
 *  return the first occurrence of the key.
 */

public class AdjDifByK_79 {
    public static void main(String[] args) {
        int arr[ ] = {4, 5, 6, 7, 6}; int k = 1 ;
        System.out.println(search(arr, arr.length, 6, k));
        
    }

    public static int search (int arr[], int n, int x, int k) {
        int i = 0;
         
        while (i < n) {
             
            // If x is found at index i
            if (arr[i] == x)
                return i;
 
            // Jump the difference between
            // current array element and x
            // divided by k We use max here
            // to make sure that i moves
            // at-least one step ahead.
            i = i + Math.max(1, Math.abs(arr[i]
                                      - x) / k);
        }
        return -1;
    }
}
