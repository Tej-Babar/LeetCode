/*289. Game of Life */

import java.util.Arrays;

public class GameOfLife {
    public static void main(String[] args) {
        int[][] board = {{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        gameOfLife(board);
    }

    public static void gameOfLife(int[][] board) {
        int m=board.length;
        int n=board[0].length;
        int arr[]=new int[n];
        int arr2[]=new int[n];
        int prev=0,p2=0,c=0;
        for (int i = 0; i < m; i++) {
            arr2=Arrays.copyOf(board[i], n);
            for (int j = 0; j < n; j++) {
                c=0;

                p2=board[i][j];

                if(j<n-1) c+=board[i][j+1];
                if(j>0) c+=prev;
                if(i>0) c+=arr[j];
                if(i<m-1) c+=board[i+1][j];
                if(i>0 && j>0) c+=arr[j-1];
                if(i>0 && j<n-1) c+=arr[j+1];
                if(i<m-1 && j>0) c+=board[i+1][j-1];
                if(i<m-1 && j<n-1) c+=board[i+1][j+1];

                if (board[i][j]==1) {
                    if(c<2) board[i][j]=0;
                    else if(c==2 || c==3) board[i][j]=1;
                    else if(c>3) board[i][j]=0;
                
                } else {
                    if(c==3) board[i][j]=1;
                }
                prev=p2;
                
            }
            arr=Arrays.copyOf(arr2, n);
        }
        
        for (int[] i : board) {
            System.out.println(Arrays.toString(i));
        }
    }
}