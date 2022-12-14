import java.util.ArrayList;
import java.util.List;

public class Word_Search2_ {
    public static void main(String[] args) {
        
    }

    public static List<String> findWords(char[][] board, String[] words) {
        List<String> list=new ArrayList<>();

        for (String word : words) {
            boolean f=true;
            for (int i = 0; i < board.length && f; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    if (board[i][j]==word.charAt(0) && match(i, j, 0, board, word)) {
                        list.add(word);
                        f=false;
                        break;
                    }
                }
            }
        }

        return list;
    }

    static boolean match(int i,int j,int idx,char[][] board,String word){
        if (idx==word.length()-1) {
            board[i][j]=(char)(board[i][j]+65);
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
