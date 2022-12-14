/* 
2352. Equal Row and Column Pairs

Given a 0-indexed n x n integer matrix grid, return the number of pairs (ri, cj) 
such that row ri and column cj are equal.

A row and column pair is considered equal if they contain the same elements in the 
same order (i.e., an equal array). */

public class EqualRowCol {
    public static void main(String[] args) {
        int grid[][] = {{3,2,1},{1,7,6},{2,7,7}};
        System.out.println(equalPairs(grid));
    }

    public static int equalPairs(int[][] grid) {
        int res=0;
        int n=grid.length;
        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                int i=0;
                while (i<n && grid[row][i]==grid[i][col]) {
                    i++;
                }
                if(i==n) res++;
            }
        }


        return res;
    }
}
