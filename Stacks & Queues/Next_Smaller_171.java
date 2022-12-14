/*
 * Professor X wants his students to help each other in the chemistry lab. 
 * He suggests that every student should help out a classmate who scored less marks 
 * than him in chemistry and whose roll number appears after him. But the students are lazy
 *  and they don't want to search too far. They each pick the first roll number 
 * after them that fits the criteria. Find the marks of the classmate that each 
 * student picks.
Note: one student may be selected by multiple classmates
 */

import java.util.Stack;

public class Next_Smaller_171 {
    public static void main(String[] args) {
        
    }

    public static int[] help_classmate(int arr[], int n) 
	{ 
	    int res[]=new int[n];
        Stack<Integer> stack=new Stack<>();

        for (int i = 0; i < n; i++) {
            if(stack.isEmpty()) stack.push(i);
            else if(arr[stack.peek()]<=arr[i]){
                stack.push(i);
            }
            else{
                while (!stack.isEmpty() && arr[stack.peek()]>arr[i]) {
                    res[stack.pop()]=arr[i];
                }
            }
        }

        while (!stack.isEmpty()) {
            res[stack.pop()]=-1;
        }

        return res;

	} 
}


