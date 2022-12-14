/*
 * Given a linked list of N nodes where nodes can contain values 0s, 1s, and 2s only. 
 * The task is to segregate 0s, 1s, and 2s linked list such that all zeros segregate 
 * to head side, 2s at the end of the linked list, and 1s in the mid of 0s and 2s.


 */

public class Segregate {
    public static void main(String[] args) {
        ListNode l11=new ListNode(2);
        ListNode l22=new ListNode(1,l11);
        ListNode l33=new ListNode(1,l22);
        ListNode list2=new ListNode(0,l33);

        ListNode head=segregate(list2);
       
        while (head!=null) {
            System.out.println(head.val);
            head=head.next;
        }
    }

    static ListNode segregate(ListNode head)
    {
        int c0=0,c1=0,c2=0;
        ListNode temp=head;
        while (temp!=null) {
            if (temp.val==0) {
                c0++;
            }
            else if (temp.val==1) {
                c1++;
            } else {
                c2++;
            }

            temp=temp.next;
        }
        ListNode ptr=head;
        while (c0>0) {
            ptr.val=0;
            ptr=ptr.next;
            c0--;
        }
        while (c1>0) {
            ptr.val=1;
            ptr=ptr.next;
            c1--;
        }
        while (c2>0) {
            ptr.val=2;
            ptr=ptr.next;
            c2--;
        }

        return head;
    }
}
