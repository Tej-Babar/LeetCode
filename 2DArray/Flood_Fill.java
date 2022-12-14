import java.util.Arrays;

public class Flood_Fill {
    public static void main(String[] args) {
        int image[][] = {{1,1,1},{1,1,0},{1,0,1}};
        int sr = 1, sc = 1, color=2;
        floodFill(image, sr, sc, color);
        for (int[] is : image) {
            System.out.println(Arrays.toString(is));
        }
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int c=image[sr][sc];
        int row=image.length;
        int col=image[0].length;
        Myfun(image,sr,sc,color,c,row,col);
        
        return image;
    }

    private static void Myfun(int[][] grid, int i, int j, int color,int c,int row,int col) {
        System.out.println(i+" "+j);

        grid[i][j]=color;

       if(i>0 && grid[i-1][j]==c) Myfun(grid, i-1, j, color, c, row, col);
       if(j>0 && grid[i][j-1]==c) Myfun(grid, i, j-1, color, c, row, col);
       if(i<row-1 && grid[i+1][j]==c) Myfun(grid, i+1, j, color, c, row, col);
       if(j<col-1 && grid[i][j+1]==c) Myfun(grid, i, j+1, color, c, row, col);

      
    }
}
