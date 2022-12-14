/*
 * Given a grid of size n*m 
 * (n is the number of rows and m is the number of columns in the grid)
 *  consisting of '0's (Water) and '1's(Land). Find the number of islands.

Note: An island is surrounded by water and is formed by connecting adjacent lands
 horizontally or vertically or diagonally i.e., in all 8 directions.
 */

public class Island_69 {
    public static void main(String[] args) {
       char[][] grid = {{'0','1','1','1','0','0','0'},{'0','0','1','1','0','1','0'}};
       System.out.println(numIslands(grid));
    }

    public static int numIslands(char[][] grid) {
        int res=0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j]=='1') {
                    res++;
                    makezero(i,j,grid);
                }
            }
        }

        return res;
    }

    public static void makezero(int i,int j,char[][] grid){
        grid[i][j]='0';

        if (i>0 && grid[i-1][j]=='1') {
            makezero(i-1, j, grid);
        }
        if (j>0 && grid[i][j-1]=='1') {
            makezero(i, j-1, grid);
        }
        if (i<grid.length-1 && grid[i+1][j]=='1') {
            makezero(i+1, j, grid);
        }
        if (j<grid[0].length-1 && grid[i][j+1]=='1') {
            makezero(i, j+1, grid);
        }
        if (i> 0 && j<grid[0].length-1 && grid[i-1][j+1]=='1') {
            makezero(i-1, j+1, grid);
        }
        if (i< grid.length-1 && j<grid[0].length-1 && grid[i+1][j+1]=='1') {
            makezero(i+1, j+1, grid);
        }
        if (i< grid.length-1 && j>0 && grid[i+1][j-1]=='1') {
            makezero(i+1, j-1, grid);
        }
        if (i>0 && j>0 && grid[i-1][j-1]=='1') {
            makezero(i-1, j-1, grid);
        }
    }
}
