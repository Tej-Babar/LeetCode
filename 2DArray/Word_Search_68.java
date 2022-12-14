/*Given an m x n grid of characters board and a string word, 
return true if word exists in the grid.

The word can be constructed from letters of sequentially adjacent cells, 
where adjacent cells are horizontally or vertically neighboring. 
The same letter cell may not be used more than once. 

Input: board = [["A","B","C","E"]
                ,["S","F","C","S"]
                ,["A","D","E","E"]],
                
                 word = "ABCCED"
Output: true
*/

public class Word_Search_68 {
    public static void main(String[] args) {
        
    }

    public static boolean exist(char[][] board, String word) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j]==word.charAt(0) && match(i, j, 0, board, word)) {
                    return true;
                }
            }
        }

        return false;
    }

    static boolean match(int i,int j,int idx,char[][] board,String word){
        if (idx==word.length()-1) {
            return true;
        }
        board[i][j]=(char)(board[i][j]-65);

        if (i>0 && board[i-1][j]==word.charAt(idx+1) && match(i-1, j, idx+1, board, word)) {
            return true;
        }
        if (j>0 && board[i][j-1]==word.charAt(idx+1) && match(i, j-1, idx+1, board, word)) {
            return true;
        }
        if (i<board.length-1 && board[i+1][j]==word.charAt(idx+1) && match(i+1, j, idx+1, board, word)) {
            return true;
        }
        if (j<board[0].length-1 && board[i][j+1]==word.charAt(idx+1) && match(i, j+1, idx+1, board, word)) {
            return true;
        }
        board[i][j]=(char)(board[i][j]+65);
        return false;
    }
   
    

}
