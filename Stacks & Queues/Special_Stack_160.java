import java.util.Stack;

public class Special_Stack_160 {

    public static void main(String[] args) {
        
    }
    Stack<Integer> min=new Stack<>();
    public void push(int a,Stack<Integer> s)
	{
        s.push(a);
        if(min.size()!=0){
            int n=min.peek();
            if(n<a) min.push(n);
            else min.push(a);
        }
        else min.push(a);
	    
	}
	public int pop(Stack<Integer> s)
    {
            min.pop();
            return s.pop();
	}
	public int min(Stack<Integer> s)
        {
           return min.peek();
	}
	public boolean isFull(Stack<Integer>s, int n)
        {
           if(s.size()==n) return true;
           else return false;
	}
	public boolean isEmpty(Stack<Integer>s)
        {
           if(s.size()==0) return true;
           else return false;
	}
}