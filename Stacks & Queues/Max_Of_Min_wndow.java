
/* Given an integer array arr[] of size N, find the maximum of the minimums for
 every window size in the given array. 
Note: The window size varies from 1 to N
*/
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Max_Of_Min_wndow {
    public static void main(String[] args) {
    }
    //Function to find maximum of minimums of every window size.
    static int[] maxOfMin1(int[] arr, int n) {
        int res[]=new int[n];
        int prevmin[]=prevmin(arr);
        int nextmin[]=nextmin(arr);
        for (int i = 0; i <n; i++) {
            int index=nextmin[i]-prevmin[i]-1;
            int m=res[index-1];
            if(m<arr[i]) res[index-1]=arr[i];
        }
        int min=res[n-1];
        for(int i=n-1;i>=0;i--){
            if(res[i]<min) res[i]=min;
            else min=res[i];
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





    static int[] maxOfMin(int[] arr, int n) 
    {
        Queue<Integer> queue=new LinkedList<>();
        int res[]=new int[n];
        int max=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]>max) max=arr[i];
            queue.add(arr[i]);
        }
        int index=0;
        res[index]=max;
        index++;max=0;

        while (queue.size()>1) {
            int op=0;
            n--;
            max=0;
            while (op<n) {
                int f=queue.poll();
                int s=queue.peek();
                f=Math.min(f, s);
                if(max<f) max=f;
                queue.add(f);
                op++;
            }
            queue.poll();
            res[index]=max;
            index++;
        }   
        System.out.println(Arrays.toString(res));
        return res;
    }
}