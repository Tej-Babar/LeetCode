import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Vector;

/*Given a list of non negative integers, arrange them in such a manner that 
they form the largest number possible.
The result is going to be very large,
 hence return the result in the form of a string. 
 nput: 
N = 5
Arr[] = {3, 30, 34, 5, 9}
Output: 9534330
Explanation: Given numbers are {3, 30, 34,
5, 9}, the arrangement 9534330 gives the
largest value.
*/
public class LargeNumForm_33 {
    public static void main(String[] args) {
        Vector<String> arr;
        arr = new Vector<>();
 
        // output should be 6054854654
        arr.add("54");
        arr.add("546");
        arr.add("548");
        arr.add("60");
        printLargest(arr);
    }
    static void printLargest(Vector<String> arr)
    {
 
        Collections.sort(arr, new Comparator<String>()
        {
            // A comparison function which is used by
            // sort() in printLargest()
            @Override public int compare(String X, String Y)
            {
 
                // first append Y at the end of X
                String XY = X + Y;
 
                // then append X at the end of Y
                String YX = Y + X;
 
                // Now see which of the two
                // formed numbers
                // is greater
                return XY.compareTo(YX) > 0 ? -1 : 1;
            }
        });
 
        Iterator it = arr.iterator();
 
        while (it.hasNext())
            System.out.print(it.next());
    }
}