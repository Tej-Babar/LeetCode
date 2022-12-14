/*
 * Max Sum without Adjacents
 * Given an array Arr of size N containing positive integers.
 *  Find the maximum sum of a subsequence such that no two numbers
 *  in the sequence should be adjacent in the array.
 */

public class FindMaxSum_84 {
    public static void main(String[] args) {
        int Arr[] = {
            174, 165, 142, 212, 254, 369, 48 ,145 ,163, 258 ,38 ,360, 224, 242,
             30, 279, 317, 36 ,191 ,343 ,289 ,107 ,41 , 443 ,
            265, 149, 447, 306, 391, 230, 371, 351, 7 ,102};
        System.out.println(findMaxSum(Arr, Arr.length));
    }
    static int findMaxSum(int arr[], int N) {
        int incl=arr[0];
        int excl=0;
        int new_excl;
        for (int i = 1; i < N; i++) {
            new_excl=Math.max(incl, excl);

            incl=excl+arr[i];
            excl=new_excl;

        }

        return Math.max(incl, excl);
    }
}
