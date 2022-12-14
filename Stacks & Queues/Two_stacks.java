public class Two_stacks {
    public static void main(String[] args) {
        TwoStack sq=new TwoStack();
        push1(1, sq);
        push1(2, sq);
        push1(3, sq);
        System.out.println(pop1(sq));

    }

    static void push1(int x, TwoStack sq)
    {
        if(sq.top1+1<sq.top2){
            sq.top1++;
            sq.arr[sq.top1]=x;
        }
        
    }

    //Function to push an integer into the stack2.
    static void push2(int x, TwoStack sq)
    {
        if(sq.top1+1<sq.top2){
            sq.top2--;
            sq.arr[sq.top2]=x;
        }

    }

    //Function to remove an element from top of the stack1.
    static int pop1(TwoStack sq)
    {
        int r=-1;
        if(sq.top1>=0){
            r= sq.arr[sq.top1];
            sq.top1=sq.top1-1;
        }
       
        return r;
        
        
    }

    //Function to remove an element from top of the stack2.
    static int pop2(TwoStack sq)
    {
        int r=-1;
        if(sq.top2<100){
            r= sq.arr[sq.top2];
            sq.top2=sq.top2+1;
        }
        return r;
    }

    
}


