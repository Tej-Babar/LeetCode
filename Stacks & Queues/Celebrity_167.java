import java.util.Stack;

public class Celebrity_167 {
    public static void main(String[] args) {
        
    }

    int celebrity1(int M[][], int n)
    {
    	Stack<Integer> stack=new Stack<>();
        for (int i = 0; i < n; i++) {
            stack.add(i);
        }
        while (stack.size()!=1) {
            int i=stack.pop();
            int j=stack.pop();
            boolean a=false,b=false;
            if (Know(i, j, M)) {
                a=true;
            }
            else b=true;

            if(Know(j, i, M)) b=true;
            else a=true;

            if(!a) stack.push(i);
            if(!b) stack.push(j);
        }
        if(stack.isEmpty()) return -1;
        else{
            int sel=stack.peek();
            for (int i = 0; i < n; i++) {
                if (M[sel][i]!=0) return -1;
                if(i!=sel && M[i][sel]!=1)  return -1;
            }

        }

        return stack.peek();
    }

    static boolean Know(int i,int j,int[][] M){
        if(M[i][j]==1) return true;
        return false;
    }

    int celebrity(int M[][], int n)
    {
    	for (int i = 0; i < n; i++) {
            int sum=0;
            for (int j = 0; j < n; j++) {
                sum+=M[i][j];
            }
            if(sum==0){
                int col=i,row=0,k=0;
                for(row=0;row<n;row++){
                    k+=M[row][col];
                }
                if(k==n-1) return col;

            }
        }

        return -1;
    }
}
