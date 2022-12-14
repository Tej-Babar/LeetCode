public class Add_2_LL {
    public static void main(String[] args) {
        ListNode n5=new ListNode(5);
        ListNode n4=new ListNode(4);
        ListNode n3=new ListNode(9,n5);
        ListNode n2=new ListNode(2,n3);
        ListNode n1=new ListNode(1,n2);
        ListNode l1=new ListNode(1,n1);

        ListNode l11=new ListNode(3);
        ListNode l22=new ListNode(2,l11);
        ListNode l33=new ListNode(1,l22);
        ListNode l2=new ListNode(9,l33);
        ListNode a=l1,b=l2;
        while (a!=null) {
            System.out.print(a.val+" ");
            a=a.next;
        }
        System.out.println();
        while (b!=null) {
            System.out.print(b.val+" ");
            b=b.next;
        }
        System.out.println();

        ListNode ans=Add(l1, l2);
        while (ans!=null) {
            System.out.print(ans.val+" ");
            ans=ans.next;
        }
    }
    public static ListNode Add(ListNode h1,ListNode h2){
        int h1s=0,h2s=0;
        ListNode temp1=h1;
        ListNode temp2=h2;
        while (temp1!=null) {
            h1s++;
            temp1=temp1.next;
        }
        while (temp2!=null) {
            h2s++;
            temp2=temp2.next;
        }
         temp1=h1;
         temp2=h2;
         ListNode h1p=null,prev=null;

        if (h1s>h2s) {
            h1p=h1;
            int d=h1s-h2s;
            while (d>0) {
                prev=temp1;
                temp1=temp1.next;
                d--;
            }
        }
        else if (h2s>h1s) {
            h1p=h2;
            int d=h2s-h1s;
            while (d>0) {
                prev=temp2;
                temp2=temp2.next;
                d--;
            }
            if (prev!=null) {
                prev.next=null;
            }
        }
        ListNode head=Fun(temp1,temp2);
        if (prev!=null) {
            head=fun1(h1p, head);
        }
        if (head.val>=10) {
            int v=head.val;
            ListNode n=new ListNode(v/10);
            head.val=v%10;
            n.next=head;
            return n;
        }
        return head;
    }
    private static ListNode fun1(ListNode temp,ListNode head){
        if (temp.next==null) {
            return head;
        }
        ListNode t=fun1(temp.next, head);
        int v=t.val;
        t.val=v%10;
        v=v/10;
        temp.next=t;
        temp.val=temp.val+v;
        return temp;
    }

    private static ListNode Fun(ListNode temp1, ListNode temp2) {
        if (temp1.next==null) {
            ListNode h=new ListNode(temp1.val+temp2.val);
            return h;
        }

        ListNode t1=Fun(temp1.next, temp2.next);
        int v=t1.val;
        t1.val=v%10;
        v=v/10;
        ListNode ret=new ListNode(temp1.val+temp2.val+v);
        ret.next=t1;
        return ret;

    }
}
