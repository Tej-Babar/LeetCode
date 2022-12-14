/*
 * Given a link list of size N, 
 * modify the list such that all the even numbers appear before all the odd numbers 
 * in the modified list. The order of appearance of numbers 
 * within each segregation should be same as that in the original list.

NOTE: Don't create a new linked list, instead rearrange the provided one.
 */

public class DivideEvenOdd {
    public static void main(String[] args) {
        ListNode l11=new ListNode(17);
        ListNode l22=new ListNode(15,l11);
        ListNode l33=new ListNode(8,l22);
        ListNode list2=new ListNode(9,l33);

        ListNode head=divide(4,list2);
        while (head!=null) {
            System.out.println(head.val);
            head=head.next;
        }
    }

    static ListNode divide(int N, ListNode head){
        ListNode cur=head;
        ListNode even=null,odd=null,oh=null;
        while (cur!=null) {
            
            if (even==null && cur.val%2==0) {
                even=cur;
                head=even;
                cur=cur.next;

            }
            if (odd==null && cur.val%2!=0) {
                odd=cur;
                oh=odd;
                cur=cur.next;

            }
            while ( cur!=null&& even!=null && cur.val%2==0) {
                even.next=cur;
                cur=cur.next;
                even=even.next;
            }

            while (cur!=null && even!=null && cur.val%2!=0) {
                odd.next=cur;
                cur=cur.next;
                odd=odd.next;
            }
        }

        if (head==null) {
            return oh;
        }
        else{
            even.next=oh;
            odd.next=null;
        }

        return head;
        
    }
}
