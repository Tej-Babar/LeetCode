import java.util.Stack;

public class CheckValidString {
    public static void main(String[] args) {
       String s = "(())()())(*))(((((())()*))**))**()(*(()()*)(**(())()**)((**(()(((()()**)())*(*))(())()()*";
        System.out.println(checkValidString(s));
    }
    public static boolean checkValidString(String s) {
        int st=0,open=0,close=0,len=s.length();
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            if(c=='(') open++;
            else if(c==')') close++;
            else st++;
        }
        if(Math.abs(open-close)>st) return false;

        st=0;
        Stack<Character> stack=new Stack<>();
        System.out.println(open+" "+close);
        if(open<=close){
            for (int i = 0; i < len; i++) {
                char c=s.charAt(i);
                if(c=='(') stack.push(c);
                else if(c=='*') st++;
                else{
                    //System.out.println(c);
                    if(stack.isEmpty() && st==0) return false;
                    else if(!stack.isEmpty()) stack.pop();
                    else st--;
                }
            }
        }
        else{
            for (int i = len-1; i >=0; i--) {
                char c=s.charAt(i);
                if(c==')') stack.push(c);
                else if(c=='*') st++;
                else{
                   
                    if(stack.isEmpty() && st==0) return false;
                    else if(!stack.isEmpty()) stack.pop();
                    else st--;
                }
            }
        }

        // System.out.println(st);
        // System.out.println(stack.size());
         if(stack.size()<=st) return true;
         return false;

        

    }
}