public class MeargeSort {
    public static void main(String[] args) {
        ListNode l11=new ListNode(2);
        ListNode l22=new ListNode(5,l11);
        ListNode l33=new ListNode(1,l22);
        ListNode list2=new ListNode(0,l33);
        sortList(list2);
        while (list2!=null) {
            System.out.println(list2.val);
            list2=list2.next;
        }
    }

    public static ListNode findMid(ListNode head) {
        ListNode fast = head.next;
        ListNode slow = head;
        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
	//merge :- returns us a sorted linked list in which two sorted linkedlists are merged 
    public static ListNode merge(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;
        ListNode ans = l1;
        
        while(l2.val<l1.val) {
            ListNode temp = l1;
            l1=l2;
            l2=temp;
            ans=l1;
        }
        
        while(l1!=null && l2!=null) {
            ListNode temp = null;
            while(l1!=null && l1.val<=l2.val) {
                temp = l1;
                l1=l1.next;
            }
            temp.next = l2;
            temp = l1;
            l1=l2;
            l2=temp;
        }
        return ans;
    }
    
    public static ListNode sortList(ListNode head) {
        //base case
        if(head==null || head.next==null) return head;
        
        //break linkedlist into 2 halves
        ListNode mid = findMid(head);
        
        ListNode left = head;
        ListNode right = mid.next;
        mid.next=null;
        
        //recursive calls to sort both the linkedlists
        left = sortList(left);
        right = sortList(right);
        
        //merge two sorted linked list
        ListNode ans  = merge(left,right);
        return ans;
    }
}