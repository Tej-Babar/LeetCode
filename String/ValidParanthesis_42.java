/*
 * Given a string s containing just the characters 
 * '(', ')', '{', '}', '[' and ']', 
 * determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
 

Example 1:

Input: s = "()"
Output: true
 */
import java.util.Stack;

public class ValidParanthesis_42 {
    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
    for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        if(c=='(' || c=='[' || c=='{'){
            stack.push(c);
        }
        else if((!stack.isEmpty()) && ( (c==')' && stack.peek()=='(') || 
        (c==']' && stack.peek()=='[') ||
        (c=='}' && stack.peek()=='{'))){

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