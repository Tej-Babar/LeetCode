public class Zig_Zag_LL {
    public static void main(String[] args) {
        
    }

    public static ListNode zigZag(ListNode head){
        ListNode prev=head;
        ListNode cur=head.next;

        if (prev.val>cur.val) {
            prev.next=cur.next;
            cur.next=prev;
            head=cur;
            Fun(prev,prev.next);
        }
        else{
            Fun(cur,cur.next);
        }
   
    }

    static ListNode Fun(ListNode prev,ListNode cur){
        if (cur==null) {
            return cur;
        }
        
    }
}
