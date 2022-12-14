public class MaxAreaIsland {
    public static void main(String[] args) {
        
    }

    public int maxAreaOfIsland(int[][] grid) {
        
        int m=grid.length;
        int n=grid[0].length;
        int ans=0,res=0;
        for (int i = 0; i <m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j]==1) {
                    ans=Find(i,j,grid);
                    System.out.println(ans);
                    if(ans>res) res=ans;
                }
            }
        }
        return res;
    }

    private int Find(int i, int j, int[][] grid) {
        int n=grid[0].length;
        int m=grid.length;
        grid[i][j]=0;
        int c=1;
        int ncol[]={1,0,-1,0};
        int nrow[]={0,1,0,-1};
        for (int k = 0; k < 4; k++) {
            int nr=i+nrow[k];
            int nc=i+ncol[k];

            if (nc>=0 && nr>=0 && nc<n && nr<m && grid[nr][nc]==1) {
                c+=Find(nr, nc, grid);
            }
        }
        return c;
    }

}
