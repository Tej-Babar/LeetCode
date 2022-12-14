/*
    Find if an expression has duplicate parenthesis or not
 * Given a balanced expression, find if it contains duplicate parenthesis or not.
 *  A set of parenthesis are duplicate if the same subexpression is surrounded by
 *  multiple parenthesis. 
 */

import java.util.Stack;

public class Duplicate_par_162 {
    public static void main(String[] args) {
        String str = "((a+b)+((c)+d))";
 
        if (findDuplicateparenthesis(str)) {
            System.out.println("Duplicate Found ");
        } else {
            System.out.println("No Duplicates Found ");
    }
}

    public static boolean findDuplicateparenthesis(String s){
        Stack<Character> stack=new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==')'){
                if(stack.peek()=='(') return true;
                while (stack.pop()!='(');
            }
            else{
                stack.push(s.charAt(i));
            }
        }


        return false;
    }
}
