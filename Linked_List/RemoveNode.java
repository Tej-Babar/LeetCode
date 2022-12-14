/*
 * Given the head of a linked list,
 * remove the nth node from the end of the list and return its head.
 */

public class RemoveNode {
    public static void main(String[] args) {
        
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode h=head;
        ListNode temp=head;
        int c=0;

        while (head!=null) {
            c++;
            head=head.next;
        }
        if(n==c) return h.next;
        c=c-n;
        while (c>1) {
            h=h.next;
            c--;
        }
        h.next=h.next.next;


        return temp;
    }
}
