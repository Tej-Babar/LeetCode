/*
 * Given a grid of dimension nxm where each cell in the grid can have values 0, 1 or 2 
 * which has the following meaning:
0 : Empty cell
1 : Cells have fresh oranges
2 : Cells have rotten oranges

We have to determine what is the minimum time required to rot all oranges.
 A rotten orange at index [i,j] can rot other fresh orange 
 at indexes [i-1,j], [i+1,j], [i,j-1], [i,j+1] (up, down, left and right) in unit time. 
 */

import java.util.LinkedList;
import java.util.Queue;

public class Rotten_Oranges_170 {
    public static void main(String[] args) {
        
    }

    static class Pair{
        int row;
        int col;
        int t;
        Pair(int i,int j,int k){
            row=i;
            col=j;
            t=k;
        }

    }
    public int orangesRotting(int[][] grid)
    {
        
        int fresh=0;
        int time=0;
        int n=grid.length,m=grid[0].length;
        int vis[][]=new int[n][m];
        Queue<Pair> queue=new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(grid[i][j]==2){
                    vis[i][j]=2;
                    queue.add(new Pair(i, j, 0));
                }

                else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        int nrow[]={-1,0,1,0};
        int ncol[]={0,-1,0,1};
        while (!queue.isEmpty()) {
            int row=queue.peek().row;
            int col=queue.peek().col;
            int t=queue.peek().t;
            queue.remove();
            if(t>time) time=t;

            for (int i = 0; i < 4; i++) {
                int nr=row+nrow[i];
                int nc=col+ncol[i];

                if(nr>=0 && nc>=0 && nr<n && nc<m && vis[nr][nc]==0 &&
                 grid[nr][nc]==1){
                    vis[nr][nc]=2;
                    grid[nr][nc]=2;
                    fresh--;
                    queue.add(new Pair(nr,nc,t+1));
                }
            }


        }

        if(fresh>0) return -1;
        return time;
    }
}

