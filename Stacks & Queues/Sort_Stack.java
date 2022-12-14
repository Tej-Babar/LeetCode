import java.util.Stack;

public class Sort_Stack {
    public static void main(String[] args) {
        
    }
    public Stack<Integer> sort(Stack<Integer> s)
	{
		Sort(s);
        return s;
	}

    private void Sort(Stack<Integer> s) {
        if(!s.isEmpty()){
            int x=s.pop();

            Sort(s);

            SortInserted(s,x);
        }
    }
    private void SortInserted(Stack<Integer> s, int x) {

        if(s.isEmpty() || s.peek()<=x){
            s.push(x);
            return;
        }

        int temp=s.pop();
        SortInserted(s, x);
        s.push(temp);
    }

}
