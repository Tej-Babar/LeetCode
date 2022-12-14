/*
 * Given an m x n matrix, return all elements of the matrix in spiral order.



 */

import java.util.ArrayList;

import java.util.List;

public class Spiral_66 {
    public static void main(String[] args) {
        int[][] matrix={
            {1,2,3},
            {4,5,6},
            {7,8,9},
           {11,12,13}};
        List<Integer> l=spiralOrder(matrix);
        for (Integer integer : l) {
            System.out.println(integer);
        }
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
         List<Integer> list=new ArrayList<>();
        int n=matrix.length;
        int m=matrix[0].length;

        int top=0;
        int right=m-1;
        int bottom=n-1;
        int left=0;
        int p=0;
        while (top<=bottom && left<=right) {
            if (p==0) {
                
                for (int i = left; i <= right; i++) {
                    list.add(matrix[top][i]);
                }
                top+=1;
                p=1;
            }
            else if (p==1) {
                for (int i = top; i <= bottom; i++) {
                    list.add(matrix[i][right]);
                }
                right-=1;
                p=2;
            }
            else if (p==2) {
                for (int i = right; i >= left; i--) {
                    list.add(matrix[bottom][i]);
                }
                bottom-=1;
                p=3;
            }
            else if (p==3) {
                for (int i = bottom; i >= top; i--) {
                    list.add(matrix[i][left]);
                }
                left+=1;
                p=0;
            }
        }

        return list;
    
    }

}
