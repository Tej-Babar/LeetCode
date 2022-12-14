/*
 * Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix.
 *  This matrix has the following properties:

Integers in each row are sorted in ascending from left to right.
Integers in each column are sorted in ascending from top to bottom.
 */

public class Search2D {
    public static void main(String[] args) {
        int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target=-5;
        System.out.println(searchMatrix(matrix, target));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int[] row=findrow(matrix, target);
        if (row[0]==-1 && row[1]==-1) {
            return true;
        }
        if (row[0]==-1 || row[1]==-1) {
            return false;
        }

        for (int i=row[0];i<=row[1];i++) {
            int s=0,e=matrix[0].length;
            while (s<=e) {
                int mid=(s+e)/2;
                if (matrix[i][mid]==target) {
                    return true;
                }
                else if(matrix[i][mid]<target){
                    s=mid+1;
                }
                else{
                    e=mid-1;
                }
            }
        }

        return false;
        
    }
    public static int[] findrow(int[][] matrix,int target){
        int row[]=new int[2];
        int s1=0;
        int e1=matrix.length-1;
        int mid;
        while (s1<=e1) {
            mid=(s1+e1)/2;

            if (matrix[mid][0]==target) {
                row[0]=-1;row[1]=-1;
                return row;
            } 
            else if(matrix[mid][0]>target){
                e1=mid-1;
            }
            else{
                s1=mid+1;
            }
        }
        row[1]=e1;
        s1=0;
        int n=matrix[0].length-1;
        e1=matrix.length-1;
        
        while (s1<=e1) {
            mid=(s1+e1)/2;

            if (matrix[mid][n]==target) {
                row[0]=-1;row[1]=-1;
                return row;
            } 
            else if(matrix[mid][n]<target){
                s1=mid+1;
            }
            else{
                e1=mid-1;
            }
        }
        row[0]=s1;

        return row;
    }
}
