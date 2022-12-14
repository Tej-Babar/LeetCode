/*
 * Given a singly linked list,
 *  remove all the nodes which have a greater value on their right side.
 * 
 * Input:
LinkedList = 12->15->10->11->5->6->2->3
Output: 15 11 6 3
Explanation: Since, 12, 10, 5 and 2 are
the elements which have greater elements
on the following nodes. So, after deleting
them, the linked list would like be 15,
11, 6, 3.
 */

import java.util.Stack;

public class MaxRight {
    public static void main(String[] args) {
        ListNode l11=new ListNode(2);
        ListNode l22=new ListNode(5,l11);
        ListNode l33=new ListNode(1,l22);
        ListNode list2=new ListNode(0,l33);

        ListNode head=compute(list2);
        while (head!=null) {
            System.out.println(head.val);
            head=head.next;
        }
    }

    static ListNode compute(ListNode head)
    {
        Stack<ListNode> stack=new Stack<>();
        ListNode temp=head;
        stack.push(temp);
        temp=temp.next;
        while (temp!=null) {
            if (temp.val<=stack.peek().val) {
                stack.push(temp);
            }
            else{
                while (!stack.isEmpty() && stack.peek().val<temp.val) {
                    stack.pop();
                }
                stack.push(temp);
            }
            temp=temp.next;
        }

        ListNode h1=stack.pop();
        ListNode ptr;
        while (!stack.isEmpty()) {
            ptr=stack.pop();
            ptr.next=h1;
            h1=ptr;

        }
        return h1;
    }
}
