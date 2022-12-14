/*
 * Given a Queue Q containing N elements. 
 * The task is to reverse the Queue.
 *  Your task is to complete the function rev(), 
 * that reverses the N elements of the queue.
 */

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;


public class Queue_Reversa {
    public static void main(String[] args) {
        
    }

    public Queue<Integer> rev(Queue<Integer> q){
        Queue<Integer> queue=new ArrayDeque<>();
        Stack<Integer>  stack=new Stack<>();
        while (!q.isEmpty()) {
            stack.add(q.poll());
        }

        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
        
        
        return queue;
    }
}
