import java.util.ArrayList;
import java.util.List;

public class GenrateParanthisis {
   
    public static void main(String[] args) {
        List<String> l=generateParenthesis(1);
        for (String string : l) {
            System.out.println(string);
        }
    }
    public static List<String> generateParenthesis(int n) {
         return Genrate(0,0,"",n);
         
    }
    
    private static List<String> Genrate(int open, int close,String s,int n) {
        if (open==n && close==n) {
            List<String> l=new ArrayList<>();
            l.add(s);
            return l;
        }
        List<String> ans=new ArrayList<>();

        if (open<=n) {
            ans.addAll(Genrate(open+1, close, s+'(',n));
        }

        if (close<open) {
            ans.addAll(Genrate(open, close+1, s+')',n));
        }

        return ans;
    }
}
