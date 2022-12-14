import java.util.Arrays;

public class BallFall {
    public static void main(String[] args) {
        int grid[][] = {{1,1,1,-1,-1},{1,1,1,-1,-1},{-1,-1,-1,1,1},{1,1,1,1,-1},{-1,-1,-1,-1,-1}};
        BallFall bf=new BallFall();
        int [] res=bf.findBall(grid);
        System.out.println(Arrays.toString(res));
    }

    public int[] findBall(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int res[] =new int[n];
        for (int col = 0; col < n; col++) {
            int j=col;
            int i=0;
            while (i<m && j>=0 && j<n) {
                if (grid[i][j]==1) {
                    if (j<n-1 && grid[i][j+1]==1) {
                        i++;
                        j++;
                    }
                    else break;
                }
                    
                    else{
                        if (j>0 && grid[i][j-1]==-1) {
                            i++;
                            j--;
                        }

                        else break;
                    }
                }
            if (i==m) {
                res[col]=j;
            } else {
                res[col]=-1;
            }
        }


        return res;
    }
}
