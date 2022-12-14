
/*
 * Given a singly linked list: A0→A1→→An-1→An, reorder it to: A0→An→A1→An-1→A2→An-2→
For example: Given 1->2->3->4->5 its reorder is 1->5->2->4->3.

Note: It is recommended do this in-place without altering the nodes' values.
 */

public class Reorder_List {
    public static void main(String[] args) {
        ListNode n5=new ListNode(5);
        ListNode n4=new ListNode(4,n5);
        ListNode n3=new ListNode(3,n4);
        ListNode n2=new ListNode(2,n3);
        ListNode n1=new ListNode(10,n2);
        ListNode head=new ListNode(1,n1);

        head=reorderlist(head);
        
        while (head!=null) {
            System.out.println(head.val);
            head=head.next;
        }
    }

    static ListNode reorderlist(ListNode head) {
        ListNode f=head;
        int c=0;
        while (f!=null) {
            f=f.next;
            c++;
        }
        ListNode h2=head;
        c=c+1;
        c=c/2;
        while (c>1) {
            h2=h2.next;
            c--;
        }
        
        ListNode prev=h2.next;
        h2.next=null;
        ListNode tail= Fun(head,prev);
        
        if (tail!=null) {
            tail.next=null;
        }
         return head;
    }

    private static ListNode Fun(ListNode head,ListNode node) {
        
            if (node==null) {
                return head;
            }
    
            ListNode first=Fun(head, node.next);
            if (first==null) {
                return null;
            }
            ListNode next1=first.next;
            first.next=node;
            node.next=next1;
    
            return next1;
       
    }
}
