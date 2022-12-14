public class SwapVal {
    public static void main(String[] args) {
        
    }
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp=head;
        int c=0;
        int node=0;
        ListNode f=null,s=null;
        while (temp!=null) {
            node++;
            temp=temp.next;
        }
        temp=head;
        while (temp!=null) {
            c++;
            if (c==k) {
                f=temp;
            }
            if (c==node-k+1) {
                s=temp;
     
            }
            temp=temp.next;
        }
        int t=f.val;
        f.val=s.val;
        s.val=t;
        return head;
    }
}
