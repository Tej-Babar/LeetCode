public class Twins_sum {
    public static void main(String[] args) {
        
    }

    public int pairSum(ListNode head) {
        int n=0;
        ListNode t=head;
        while (t!=null) {
            n++;
            t=t.next;
        }
        n=n/2;
        t=head;
        while (n>1) {
            t=t.next;
            n--;
        }
        ListNode cur=t.next;
        t.next=null;
        ListNode nx,prev=null;
        while (cur!=null) {
            nx=cur.next;
            cur.next=prev;
            prev=cur;
            cur=nx;
        }
        int res=0,sum=0;
        while (head!=null) {
            sum=head.val+prev.val;
            if(sum>res) res=sum;
        }

        return res;


    }
}

