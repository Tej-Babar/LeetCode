/*  82. Remove Duplicates from Sorted List II
 * Given the head of a sorted linked list, 
 * delete all nodes that have duplicate numbers, 
 * leaving only distinct numbers from the original list. 
 * Return the linked list sorted as well.
 * 
 * Input: head = [1,2,3,3,4,4,5]
    Output: [1,2,5]
 */

public class RemoveDuplicates {
    public static void main(String[] args) {
        ListNode n5=new ListNode(6);
        ListNode n4=new ListNode(4,n5);
        ListNode n3=new ListNode(4,n4);
        ListNode n2=new ListNode(3,n3);
        ListNode n1=new ListNode(1,n2);
        ListNode head=new ListNode(1,n1);
        head=deleteDuplicates(head);
        while (head!=null) {
            System.out.print(head.val+" ");
            head=head.next;
        }
    }
    public static ListNode deleteDuplicates(ListNode head) {
        if (head==null || head.next==null) {
            return head;
        }
        ListNode prev=head;
        ListNode cur=head.next;
        ListNode back=new ListNode(-1);
        ListNode b=back;
        
        while (cur!=null) {
            if (prev.val==cur.val) {
                while (cur!=null && prev.val==cur.val) {
                    cur=cur.next;
                    prev=prev.next;
                }
                prev=cur;
                if(cur!=null) cur=cur.next;
            } else {
                back.next=prev;
                prev=cur;
                cur=cur.next;
                back=back.next;
                back.next=null;

            }
        }
        if(prev!=null){
            back.next=prev;
            
        }

        return b.next;


    }
}