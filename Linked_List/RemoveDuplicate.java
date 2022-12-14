import java.util.HashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
        ListNode l11=new ListNode(35);
        ListNode l22=new ListNode(10,l11);
        ListNode l33=new ListNode(10,l22);
        ListNode list2=new ListNode(5,l33);

        ListNode head=removeDuplicates(list2);
       
        while (head!=null) {
            System.out.println(head.val);
            head=head.next;
        }
    }
    public static ListNode removeDuplicates(ListNode head) 
    {
        HashSet<Integer> hs =new HashSet<>();
        ListNode temp=head;
        ListNode prev=head;


        hs.add(temp.val);

        while (temp!=null) {
            if (!hs.contains(temp.val)) {
                hs.add(temp.val);
                prev=temp;
                temp=temp.next;
            }
            else{
                prev.next=temp.next;
                temp=temp.next;
            }
        }

        return head;
    }
}
