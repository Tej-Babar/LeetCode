/*
 * Given the head of a singly linked list, return true if it is a 
palindrome
 or false otherwise.
 */

public class Palindrome {
    public static void main(String[] args) {
        
    }

    public static boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head.next;
        while (fast!=null && fast.next!=null ) {
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode h2=Reverse(slow);
        while (h2!=null) {
            if (h2.val!=head.val) {
                return false;
            }
            h2=h2.next;
            head=head.next;
        }

        return true;
    }

    private static ListNode Reverse(ListNode slow) {
        ListNode cur=slow;
        ListNode next=null,prev=null;
        while (cur!=null) {
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }

        return prev;
    }
}
