import java.util.Stack;

public class EvaluateExp {
    public static void main(String[] args) {
        String token[]={"2","1","+","3","*"};
        System.out.println(evalRPN(token));
    }

    public static int evalRPN(String[] tokens) {

        Stack<Integer> st=new Stack<>();
        int fi,se;
        for (int i = 0; i < tokens.length; i++) {
            String s=tokens[i];
            if(s.equals("+")){
                se=st.pop();
                fi=st.pop();
                st.push(fi+se);
            }
            else if(s.equals("-")){
                se=st.pop();
                fi=st.pop();
                st.push(fi-se);
            }
            else if(s.equals("*"))
            {
                se=st.pop();
                fi=st.pop();
                st.push(fi*se);
            }
            else if(s.equals("/")){
                se=st.pop();
                fi=st.pop();
                st.push(fi/se);
            }
            else{
                st.push(Integer.parseInt(s));
            }
        }

        return st.pop();
    }
}
