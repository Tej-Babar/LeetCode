/*
 * Determine if a 9 x 9 Sudoku board is valid.
 *  Only the filled cells need to be validated according to the following rules:

Each row must contain the digits 1-9 without repetition.
Each column must contain the digits 1-9 without repetition.
Each of the nine 3 x 3 sub-boxes of the grid must contain 
the digits 1-9 without repetition.
 */

public class Valid_Sudoku {
    public static void main(String[] args) {
        
    }
    public boolean isValidSudoku(char[][] board) {

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(board[i][j]!='.'){
                   if(!check(i,j,board)) return false;
                }
            }
            
        }
        
        return true;
      
    }

    public static boolean check(int row,int col,char[][] board){
        int num=board[row][col];
        for (int j = 0; j<9; j++) {
            if (j!=col && board[row][j]==num) {
                return false;
            }
            if (j!=row && board[j][col]==num) {
                return false;
            }
        }

        int si=(row/3)*3;
        int sj=(col/3)*3;

        for (int i = si; i < si+3; i++) {
            for (int j = sj; j <sj+3; j++) {
                if (!(i==row && col==j)) {
                    if (board[i][j]==num) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}
