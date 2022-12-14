
import java.util.Stack;

public class RecatangleOF1_23 {
    public static void main(String[] args) {
        int M[][] = {{0, 1, 1, 0},
         {1,1, 1, 1},
         {1,1, 1, 1},
         {1,1, 0, 0}};
        System.out.println(Rectangle(M));
    }

    static int Rectangle(int[][] arr){
        int[] currow=arr[0];
        int max=maxHistagram(currow);
        for (int i = 1; i < currow.length; i++) {
            for (int j = 0; j < currow.length; j++) {
                if (arr[i][j]==0) {
                    currow[j]=0;
                }
                else{
                    currow[j]++;
                }
            }
            max=max<maxHistagram(currow)?maxHistagram(currow):max;
        }

        return max;
    }

    static int maxHistagram(int[] arr){
        
       int[] p=prev(arr);
       int[] n=next(arr);
       int max=(n[0]-p[0]-1)*arr[0];
       for (int i = 1; i < arr.length; i++) {
         max=max<(n[i]-p[i]-1)*arr[i]?(n[i]-p[i]-1)*arr[i]:max;
       }

       return max;
    }

    static int[] prev(int [] arr){
        int n=arr.length;
        int[] p=new int[n];
        Stack<Integer> s=new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() && arr[s.peek()]>=arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                p[i]=-1;
            }
            else{
                p[i]=s.peek();
            }
            s.push(i);
        }

        return p;
    }

    static int[] next(int [] arr){
        int n=arr.length;
        int[] p=new int[n];
        Stack<Integer> s=new Stack<>();
        for (int i = n-1; i>=0; i--) {
            while (!s.isEmpty() && arr[s.peek()]>=arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                p[i]=n;
            }
            else{
                p[i]=s.peek();
            }
            s.push(i);
        }

        return p;
    }
}
