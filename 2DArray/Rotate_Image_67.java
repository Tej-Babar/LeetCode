/*
 * You are given an n x n 2D matrix representing an image,
 *  rotate the image by 90 degrees (clockwise).

You have to rotate the image in-place,
 which means you have to modify the input 2D matrix directly.
  DO NOT allocate another 2D matrix and do the rotation.

  Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
    Output: [[7,4,1],[8,5,2],[9,6,3]]
 */

public class Rotate_Image_67 {
    public static void main(String[] args) {
        
    }

    public static void rotate(int[][] matrix) {
        int l=matrix[0].length;
        int n=l/2;
        int k=l-1;
        int m=l-1;
        
        for(int i=0;i<n;i++){
            for(int j=i;j<k-i;j++){
                int a=matrix[i][j];
                int b=matrix[j][m-i];
                int c=matrix[m-i][m-j];
                int d=matrix[m-j][i];
                
                matrix[i][j]=d;
                matrix[j][m-i]=a;
                matrix[m-i][m-j]=b;
                matrix[m-j][i]=c;
                
            }
        }
    }
}