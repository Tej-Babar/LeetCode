import java.util.ArrayList;
import java.util.List;

public class ReorderList {
    public static void main(String[] args) {
        
    }

    public void reorderList(ListNode head) {
        List<Integer> list=new ArrayList<>();
        ListNode temp=head;
        ListNode ptr=head;

        while (temp!=null) {
            list.add(temp.val);
            temp=temp.next;
        }

        int n=list.size();
        int i=0;
        for (i = 0; i < n/2; i++) {
            ptr.val=list.get(i);
            ptr.next.val=list.get(n-i-1);
            ptr=ptr.next.next;
        }
        if (n%2!=0) {
            ptr.val=list.get(i);
        }

       
    }
}
