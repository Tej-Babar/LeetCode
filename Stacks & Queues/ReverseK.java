/*
 * Given an integer K and a queue of integers, 
 * we need to reverse the order of the first K elements of the queue, 
 * leaving the other elements in the same relative order.
 */
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class ReverseK {
    public static void main(String[] args) {
        
    }
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        Stack<Integer> stack=new Stack<>();

        while (k>0 && !q.isEmpty()) {
            stack.push(q.poll());
            k--;
        }
        Queue<Integer> queue=new ArrayDeque<>();
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        while (!q.isEmpty()) {
            queue.add(q.poll());
        }

        return queue;
    }
}
