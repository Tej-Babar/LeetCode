/*
 * Given a binary grid of n*m. Find the distance of the nearest 1 in the grid for each cell.
 * 
The distance is calculated as |i1  - i2| + |j1 - j2|, 
where i1, j1 are the row number and column number of the current cell, 
and i2, j2 are the row number and column number of the nearest cell having value 1.

 */

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Nearest_Dist_169 {
    public static void main(String[] args) {
       int[][] grid= {  {0,1, 1, 0 },
                        {1,1, 0, 0 },
                        {0,0, 1, 1},
                        {0,0, 0, 0}};
        nearest(grid);
    }

    static class Pair{
        int row;
        int col;
        int val;
        Pair(int i,int j,int k){
            row=i;
            col=j;
            val=k;
        }

    }
    public static int[][] nearest(int[][] grid)
    {
        int m=grid.length;
        int n=grid[0].length;
        
        boolean check[][]=new boolean[m][n];
        Queue<Pair> queue=new LinkedList<>();

        for (int i = 0; i <m; i++) {

            for (int j = 0; j < n; j++) {
                if(grid[i][j]==1){
                    grid[i][j]=0;
                    check[i][j]=true;
                    queue.add(new Pair(i, j, 0));
                }
            }
        }

        int nrow[]={-1,0,1,0};
        int ncol[]={0,-1,0,1};

        while (!queue.isEmpty()) {
            int row=queue.peek().row;
            int col=queue.peek().col;
            int val=queue.peek().val;
            queue.remove();

            for(int i=0;i<4;i++){
                int nr=nrow[i]+row;
                int nc=col+ncol[i];

                if(nr>=0 && nc>=0 && nr<m && nc<n && check[nr][nc]==false){
                    grid[nr][nc]=val+1;
                    check[nr][nc]=true;
                    queue.add(new Pair(nr, nc, val+1));
                }
            }
        }

        

        for (int[] is : grid) {
            System.out.println(Arrays.toString(is));
        }
        return grid;
    }
}

