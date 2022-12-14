/*
 * Given string S representing a postfix expression, 
 * the task is to evaluate the expression and find the final value. 
 * Operators will only include the basic arithmetic operators 
 * like *, /, + and -.
 */

import java.util.Stack;

public class Postfix_EX {
    public static void main(String[] args) {
        String S =  "123+*8-";
        System.out.println(evaluatePostFix(S));
    }

    public static int evaluatePostFix(String S)
    {
        int ans=0;
        Stack<Integer> stack=new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            char c=S.charAt(i);
            if (c=='/' || c=='*' || c=='-' || c=='+') {
                int op2=stack.pop();
                int op1=stack.pop();
                int cp=Cal(op1,op2,c);
               
                stack.push(cp);
            }
            else{
                int z=c-'0';
                stack.push(z);
            }
        }
        ans=stack.pop();
        return ans;
    }

    private static int Cal(int op1, int op2, char c) {
        if (c=='+') {
            return (op1+op2);
        }
        if (c=='-') {
            return (op1-op2);
        }
        if (c=='/') {
            return (op1/op2);
        }
        if (c=='*') {
            return (op1*op2);
        }
        return 0;
    }
}
