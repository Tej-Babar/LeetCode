/*
 * Given a matrix where every element is either ‘O’ or ‘X’, 
 * replace ‘O’ with ‘X’ if surrounded by ‘X’. 
 * A ‘O’ (or a set of ‘O’) is considered to be by surrounded by ‘X’ 
 * if there are ‘X’ at locations just below, just above, just left and just right of it. 
 */

public class Replace_O_X_70 {
    public static void main(String[] args) {
        char[][] mat = 
                     {  {'O', 'O', 'O', 'O', 'X', 'X', 'O',},
                        {'O', 'X', 'O', 'X', 'O', 'O', 'X',},
                        {'X', 'X', 'X', 'X', 'O', 'X', 'O',},
                        {'O', 'X', 'X', 'X', 'O', 'O', 'O',}
                    };
        int  n = mat.length, m = mat[0].length;
        char[][] ans=fill(n, m, mat);
        for (char[] cs : ans) {
            for (char cs2 : cs) {
                System.out.print(cs2+" ");
            }
            System.out.println();
        }
    }
    static char[][] fill(int n, int m, char a[][])
    {
        for (int i = 1; i < n-1; i++) {
            for (int j = 1; j < m-1; j++) {
               
                if (a[i][j]!='X' && check(i, j, a, n, m)) {
                a[i][j]='X';
            }
            }
        }


        return a; 
    }

    static boolean check(int i,int j,char[][] board,int n,int m){
        if (board[i][j]=='X') {
            return true;
        }
        if ((board[i][j] !='X') && (i==0 || j==0 || i==n-1 || j==m-1)) {
            return false;
        }
        board[i][j]='X';

        boolean left,right,up,down;
        if (j<m-1 && board[i][j+1]=='X') {
            left=true;
        }
        else{
            left=check(i, j+1, board, n, m);
        }

        if (j>0 && board[i][j-1]=='X') {
            right=true;
        }
        else{
            right=check(i, j-1, board, n, m);
        }

        if (i>0 && board[i-1][j]=='X') {
            up=true;
        }
        else{
            up=check(i-1, j, board, n, m);
        }

        if (i<n-1 && board[i+1][j]=='X') {
            down=true;
        }
        else{
            down=check(i+1, j, board, n, m);
        }

        if (left && right && up && down) {
            board[i][j]='O';
            return true;
        }
        else{
            board[i][j]='O';
            return false;
        }
    }


}
