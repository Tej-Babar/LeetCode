import java.util.Stack;

public class Daily_Temp_769 {
    public static void main(String[] args) {
        
    }

    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int res[]=new int[n];
        Stack<Integer> stack=new Stack<>();
        for (int i = 0; i < n; i++) {
            
            if(stack.isEmpty()) stack.push(i);
            else if(temperatures[stack.peek()]>=temperatures[i]) stack.push(i);
            else{
                while (!stack.isEmpty() && temperatures[stack.peek()]<temperatures[i]) {
                    res[temperatures[stack.peek()]]=i-temperatures[stack.peek()];
                    stack.pop();
                }
                stack.push(i);
            }
        }

        while (!stack.isEmpty()) {
            res[stack.pop()]=0;
        }

        return res;
    }
}
