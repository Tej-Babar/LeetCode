public class MeargeBetween {
    public static void main(String[] args) {
        
    }

    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode head=list2;
        while (list2!=null && list2.next!=null) {
            list2=list2.next;
        }
        ListNode tail=list2;

        ListNode f=null, s=null;

        ListNode temp=list1;
        b=b-a;
        while (a>1) {
            a--;
            temp=temp.next;
        }
        f=temp;
        
        while (b>=0) {
            b--;
            temp=temp.next;
        }
        s=temp.next;

        f.next=head;
        tail.next=s;

        return list1;
        
    }
}