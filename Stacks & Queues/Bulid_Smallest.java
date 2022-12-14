import java.util.Stack;

public class Bulid_Smallest {
    public static void main(String[] args) {
        
    }
    static String buildLowestNumber(String str, int k) {
        int p=k;
        String  ans="";
        int n=str.length();
        if(n<=k) return "0";
        
        Stack<Character> stack=new Stack<>();
        int i=0;
        
        while (k>0 && i<n) {
            char c=str.charAt(i);
            if(stack.isEmpty()) stack.push(c);
            else if(c>=stack.peek()){
                stack.push(c);
            }
            else{
                while (k>0 && !stack.isEmpty() && stack.peek()>c) {
                    stack.pop();
                    k--;
                }
                stack.push(c);
            }
            i++;
        }
        
        
        String r="";
        while (!stack.isEmpty()) {
            r=stack.pop()+r;
            
        }
        
        ans+=r+str.substring(i);
        i=0;
        while(i<n && ans.charAt(i)=='0') i++;
        
        if(k>0){
            n=ans.length();
            if(n-p-1<1) return "0";
            return ans.substring(0,n-p-1);
        }

        return ans.substring(i);
    }

}
