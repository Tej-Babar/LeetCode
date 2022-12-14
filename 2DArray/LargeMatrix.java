public class LargeMatrix {

    public static void main(String[] args) {
        
    }
    public static int[][] largestLocal(int[][] grid) {
        int n=grid.length;
        int[][] ans=new int[n-2][n-2];

        for (int i = 0; i < n-2; i++) {
            for (int j = 0; j <n-2; j++) {
                ans[i][j]=max(i, j, grid);
            }
        }
        return ans;
        
    }

    static int max(int s1,int s2,int[][] grid){
        int max=grid[s1][s2];
        for (int i = s1; i < s1+3; i++) {
            for (int j = s2; j<s2+3; j++) {
                max=grid[i][j]>max?grid[i][j]:max;
            }
        }
        return max;
    }
}