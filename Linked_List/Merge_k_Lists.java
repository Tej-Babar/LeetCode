/*
 * You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.

Merge all the linked-lists into one sorted linked-list and return it.
 */

public class Merge_k_Lists {
    public static void main(String[] args) {
        
    }


    public static ListNode mergeKLists(ListNode[] lists) {
        int k=lists.length;
        if (k==0) {
            return null;
        }
        if (k<=1) {
            return lists[0];
        }
        ListNode head=lists[0];
        for (int i = 1; i < lists.length; i++) {
            head=Merge(head, lists[i]);
        }

        return head;

    }

    private static ListNode Merge(ListNode left, ListNode right) {
        if(left==null) return right;
        if(right==null) return left;
        ListNode head=new ListNode(-1);
        ListNode temp=head;
        while (left!=null && right!=null) {
            if (left.val<right.val) {
                temp.next=left;
                left=left.next;
                temp=temp.next;

            } else {
                temp.next=right;
                right=right.next;
                temp=temp.next;
            }
        }

        while (left!=null) {
            temp.next=left;
            left=left.next;
            temp=temp.next;
            
        }

        while (right!=null) {
            temp.next=right;
            right=right.next;
            temp=temp.next; 
        }

        return head.next;
    }
}
