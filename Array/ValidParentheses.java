import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s="({}[()])";
        System.out.println(isValid(s));
    }

public static boolean isValid(String s) {
    Stack<Character> stack=new Stack<Character>();
    for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        if(c=='(' || c=='[' || c=='{'){
            stack.push(c);
        }
        else if((c==')' && stack.peek()=='(') || 
        (c==']' && stack.peek()=='[') ||
        (c=='}' && stack.peek()=='{')){

          stack.pop();  
        }
        else{
            return false;
        }
        }
    if(stack.isEmpty()){
        return true;
    }
    else
        return false;
    }
}
