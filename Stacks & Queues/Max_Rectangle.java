import java.util.Stack;

public class Max_Rectangle {
    public static void main(String[] args) {
        
    }

    public int maxArea(int M[][], int n, int m) {
        int res=0,max=0;
        int arr[]=new int[m];
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < m; j++) {
                if(M[i][j]==0) arr[j]=0;
                else arr[j]+=1;
            }

            int prevmin[]=prevmin(arr);
            int nextmin[]=nextmin(arr);
            for (int k = 0; k < m; k++) {
                max=(nextmin[k]-prevmin[k]-1)*arr[k];
                if(max>res) res=max;
            }
        }
        return res;
    }

    static int[] prevmin(int[] arr){
        int n=arr.length;
        int res[]=new int[n];
        Stack<Integer> stack=new Stack<>();

        for (int i = n-1; i>=0; i--) {
            if(stack.isEmpty()) stack.push(i);
            else if(arr[stack.peek()]<=arr[i]){
                stack.push(i);
            }
            else{
                while (!stack.isEmpty() && arr[stack.peek()]>arr[i]) {
                    res[stack.pop()]=i;
                }
                stack.push(i);
            }
        }

        while (!stack.isEmpty()) {
            res[stack.pop()]=-1;
        }

        return res;
    }

    static int[] nextmin(int[] arr){
        int n=arr.length;
        int res[]=new int[n];
        Stack<Integer> stack=new Stack<>();

        for (int i = 0; i < n; i++) {
            if(stack.isEmpty()) stack.push(i);
            else if(arr[stack.peek()]<=arr[i]){
                stack.push(i);
            }
            else{
                while (!stack.isEmpty() && arr[stack.peek()]>arr[i]) {
                    res[stack.pop()]=i;
                }
                stack.push(i);
            }
        }

        while (!stack.isEmpty()) {
            res[stack.pop()]=n;
        }

        
        return res;
    }

}
