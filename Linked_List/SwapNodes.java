public class SwapNodes {
    public static void main(String[] args) {
        
    }

    public ListNode swapPairs(ListNode head) {

        if (head==null || head.next==null) {
            return head;
        }
        ListNode prev=null;
        ListNode f=head;
        ListNode s=head.next;
        ListNode n=null;

        while (f!=null && s!=null) {
            n=s.next;
            s.next=f;
            if (prev!=null) {
                prev.next=s;
            }
            else{
                head=s;
            }
            prev=f;
            f=n;
            if(n!=null) s=n.next;
        }

        prev.next=n;

        

        return head;
    }
}
