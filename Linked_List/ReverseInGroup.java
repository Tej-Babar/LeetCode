/*
 * Given the head of a linked list, reverse the nodes of the list k at a time, 
 * and return the modified list.

k is a positive integer and is less than or equal to the length of the linked list. 
If the number of nodes is not a multiple of k then left-out nodes, in the end, 
should remain as it is.

You may not alter the values in the list's nodes, only nodes themselves may be changed.
 */

public class ReverseInGroup {
    public static void main(String[] args) {
        
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        
        ListNode temp=head;
        int c=0;
        while (temp!=null) {
            c++;
            temp=temp.next;
        }
        c=c/k;
        if (c==0) {
            return head;
        }
        ListNode node=new ListNode(-1);
        ListNode r=node;
        int i=k;
        temp=head;
        while ((c)>0) {
            int z=k;
            head=temp;
           while (z>0) {
            temp=temp.next;
            z--;

           }
           node.next=rev(head, i);
           node=head;
           c--;
        }
        node.next=temp;


        return r.next;
    }

    static ListNode rev(ListNode head,int c){
        ListNode cu=head;
        ListNode prev=null,ne=null;

        while (cu!=null && c>0) {
            ne=cu.next;
            cu.next=prev;
            prev=cu;
            cu=ne;
            c--;

        }

        return prev;
    }
}
