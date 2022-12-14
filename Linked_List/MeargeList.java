public class MeargeList {
    public static void main(String[] args) {
        ListNode l1=new ListNode(35);
        ListNode l2=new ListNode(50,l1);
        ListNode l3=new ListNode(10,l2);
        ListNode list1=new ListNode(5,l3);

        ListNode l11=new ListNode(35);
        ListNode l22=new ListNode(50,l11);
        ListNode l33=new ListNode(10,l22);
        ListNode list2=new ListNode(5,l33);

        ListNode head=mergeTwoLists(list1, list2);
       
        while (head!=null) {
            System.out.println(head.val);
            head=head.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null && list2==null)
            return null;
        else if(list1==null && list2!=null)
            return list2;
        else if(list1!=null && list2==null)
            return list1;
        
        ListNode temp = new ListNode();
        ListNode res = new ListNode();
        if(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                temp = list1;
                list1=list1.next;
            }else{
                temp=list2;
                list2=list2.next;
            }
        }
        res=temp;
        
        while(list1!=null || list2!=null){
            if(list1!=null && list2!=null){
                if(list1.val<=list2.val){
                    temp.next=list1;
                    list1=list1.next;
                }else{
                    temp.next=list2;
                    list2=list2.next;
                }
            }else if(list1!=null){
                temp.next=list1;
                return res;
            }else{
                temp.next=list2;
                return res;
            }
            temp=temp.next;
        }
        
        return res;
    }
}

