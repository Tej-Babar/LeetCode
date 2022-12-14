/*
 * 463
 * You are given row x col grid representing a map where grid[i][j] = 1 represents land 
 * and grid[i][j] = 0 represents water.

Grid cells are connected horizontally/vertically (not diagonally). 
The grid is completely surrounded by water, and there is exactly one island 
(i.e., one or more connected land cells).

The island doesn't have "lakes", meaning the water inside isn't connected to the water 
around the island. One cell is a square with side length 1. The grid is rectangular, 
width and height don't exceed 100. Determine the perimeter of the island.
 */
public class Island_Perimeter {
    public static void main(String[] args) {
        int grid[][] = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        System.out.println(islandPerimeter(grid));
    }

    public static int islandPerimeter(int[][] grid) {
        int res=0;
        int row=grid.length;
        int col=grid[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int c=0;
                if (grid[i][j]==1) {
                    if(i>0 && grid[i-1][j]==0) c++;
                    if(j>0 && grid[i][j-1]==0) c++;
                    if(i<row-1 && grid[i+1][j]==0) c++;
                    if(j<col-1 && grid[i][j+1]==0) c++;
                    if(i==0) c++;if(j==0) c++;if(i==row-1)c++;if(j==col-1) c++;
                 
                    res+=c;
                }

            }
        }

        return res;
        
    }
}
