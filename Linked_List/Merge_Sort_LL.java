

public class Merge_Sort_LL {
    public static void main(String[] args) {
        ListNode n5=new ListNode(5);
        ListNode n4=new ListNode(4,n5);
        ListNode n3=new ListNode(3,n4);
        ListNode n2=new ListNode(2,n3);
        ListNode n1=new ListNode(10,n2);
        ListNode head=new ListNode(1,n1);

        head=Sort(head);
        while (head!=null) {
            System.out.println(head.val);
            head=head.next;

        }
        
    }


    public static ListNode Sort(ListNode head){
        if (head==null || head.next==null) {
            return head;
        }

        ListNode mid=FindMid(head);

        ListNode left=head;
        ListNode right=mid.next;
        mid.next=null;

        left=Sort(left);
        right=Sort(right);

        return Merge(left,right);

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

    private static ListNode FindMid(ListNode head) {
        ListNode slow=head;
        ListNode fast=head.next;

        while (fast!=null && fast.next!=null) {
            fast=fast.next.next;
            slow=slow.next;
        }

        return slow;
    }
}
