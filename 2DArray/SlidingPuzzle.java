public class SlidingPuzzle {
    public static void main(String[] args) {
        int board[][] = {{1,2,3},{5,4,0}};
        System.out.println(slidingPuzzle(board));
    }
    public static int slidingPuzzle(int[][] board) {
        int res=0;

        int ans[][]={{1,2,3},{4,5,0}};

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                if(board[i][j]==0){
                    return Solve(i,j,board,ans);
                }
            }
        }

        return res;
    }
    private static int Solve(int i, int j, int[][] board, int[][] ans) {
        int k=0,k2=0;
        for ( k = 0; k < 2; k++) {
            for ( k2 = 0; k2 < 3; k2++) {
                if(ans[k][k2]==board[k][k2])continue;
                else break;
            }
        }
        if(k==2 && k2==3) return 0;

        int a=ans[i][j];

        if(i>0 && board[i-1][j]==a){
            board[i-1][j]=0;board[i][j]=a;
            return 1+ Solve(i-1, j, board, ans);
        }
        else if(j>0 && board[i][j-1]==a){
            board[i][j-1]=0;board[i][j]=a;
            return 1+Solve(i, j-1, board, ans);
        }
        else if(i<1 && board[i+1][j]==a){
            board[i+1][j]=0;board[i][j]=a;
            return 1+Solve(i+1, j, board, ans);
        }
        else if(j<2 && board[i][j+1]==a){
            board[i][j+1]=0;board[i][j]=a;
            return 1+Solve(i, j+1, board, ans);
        }

        else{
            return -1;
        }

    }
}
