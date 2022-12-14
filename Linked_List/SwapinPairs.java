public class SwapinPairs {
    public static void main(String[] args) {
        
    }

    public static ListNode swapPairs(ListNode head){
        if (head==null || head.next==null) {
            return head;
        }
        ListNode node=new ListNode(-1);
        ListNode prev=node;
        ListNode n;
        
        while (head!=null && head.next!=null) {
            n=head.next.next;
            prev.next=head.next;
            prev.next.next=head;
            prev=head;
            head=n;

        }
      
            prev.next=head;
        


        return node.next;
    }
}
