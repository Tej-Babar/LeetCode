/*
 * Given an array arr[ ] of size N having elements, 
 * the task is to find the next greater element for each element of the array in order 
 * of their appearance in the array.
Next greater element of an element in the array is the nearest element on the right 
which is greater than the current element.
If there does not exist next greater of current element, then next greater element 
for current element is -1. For example, next greater of the last element is always -1.
 */

import java.util.Stack;

public class Next_Grater_168 {

    public static void main(String[] args) {
        
    }
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        long[] next=new long[n];
        Stack<Integer> stack=new Stack<>();
    
        for (int i = 0; i <n; i++) {
            if(stack.isEmpty()) stack.push(i);
            else if(stack.peek()>=arr[i]){
                stack.push(i);
            }
            else{
                next[stack.pop()]=arr[i];
                stack.push(i);
            }


        }

        while (!stack.isEmpty()) {
            next[stack.pop()]=-1;
        }
        return next;
    } 
}