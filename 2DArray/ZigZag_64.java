/*
 * 
1     2     3     4
5     6     7     8
9    10    11    12
13    14    15    16
17    18    19    20

Diagonal printing of the above matrix is

1
5 2
9 6 3
13 10 7 4
17 14 11 8
18 15 12
19 16
20
 */

public class ZigZag_64 {
    public static void main(String[] args) {
       int[][] arr={ 
        { 1,  2,  3,  4  },   
        { 5,  6,  7,  8  },
        { 9,  10, 11, 12 },
        { 13, 14, 15, 16 },
        { 17, 18, 19, 20 }, };

        zigzag(arr);
    }

    public static void zigzag(int[][] arr){
        int n=arr.length;
        for (int l = 0; l < n; l++) {
            int i=l;
            int j=0;
            while (i>=0 && j<arr[0].length) {
                System.out.print(arr[i][j]+" ");
                i--;
                j++;
            }
            System.out.println();
        }
        for (int l = 1; l < arr[0].length; l++) {
            int i=n-1;
            int j=l;
            while (i>=0 && j<arr[0].length) {
                System.out.print(arr[i][j]+" ");
                i--;
                j++;
            }
            System.out.println();
       }
    }
}