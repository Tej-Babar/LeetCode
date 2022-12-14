/*
 * Given the head of a singly linked list, group all the nodes with odd 
 * indices together followed by the nodes with even indices, and return the reordered list.
 * 

The first node is considered odd, and the second node is even, and so on.

Note that the relative order inside both the even and odd groups should remain as
it was in the input.

You must solve the problem in O(1) extra space complexity and O(n) time complexity.
 */

public class Odd_Evev_LL {
    public static void main(String[] args) {
        ListNode n5=new ListNode(6);
        ListNode n4=new ListNode(5,n5);
        ListNode n3=new ListNode(4,n4);
        ListNode n2=new ListNode(3,n3);
        ListNode n1=new ListNode(2,n2);
        ListNode head=new ListNode(1,n1);
        head=oddEvenList(head);
        while (head!=null) {
            System.out.print(head.val+" ");
            head=head.next;
        }
    }

    public static ListNode oddEvenList(ListNode head) {
        ListNode odd=head;
        if (odd==null || odd.next==null || odd.next.next==null) {
            return head;
        }
        ListNode even=odd.next;
        ListNode ste=even;
        ListNode temp=even.next;
        while (temp!=null && temp.next!=null) {
            odd.next=temp;
            even.next=temp.next;
            temp=temp.next.next;
            odd=odd.next;
            even=even.next;
        }

        if(temp!=null) {
        odd.next=temp;
        odd=odd.next;

        }
        even.next=null;

        odd.next=ste;


        return head;

    }
}
