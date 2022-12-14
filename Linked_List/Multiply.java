import javax.swing.tree.TreeNode;

public class Multiply {
    public static void main(String[] args) {
        ListNode l1=new ListNode(35);
        ListNode l2=new ListNode(50,l1);
        ListNode l3=new ListNode(10,l2);
        ListNode list1=new ListNode(5,l3);

        ListNode l11=new ListNode(35);
        ListNode l22=new ListNode(50,l11);
        ListNode l33=new ListNode(10,l22);
        ListNode list2=new ListNode(5,l33);

        System.out.println(multiplyTwoLists(list1, list2));

        
    }

    public static long  multiplyTwoLists(ListNode l1,ListNode l2){
          long ans=0;

          long num1=0,num2=0;
          long n=(long) (Math.pow(10, 9)+7);

          while (l1!=null || l2!=null) {
                if (l1!=null && l2!=null) {
                    num1=(num1*10)%n+l1.val;
                    num2=(num2*10)%n+l2.val;
                    l1=l1.next;
                    l2=l2.next;
                }

                else if (l1!=null) {
                    num1=(num1*10)%n+l1.val;
                    l1=l1.next;
                } else {
                    num2=(num2*10)%n+l2.val;
                    l2=l2.next;
                }
          }

          ans=(num1*num2)%n;


          return ans;
    }
}
