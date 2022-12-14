/*
 * Given two singly linked lists of size N and M,
 *  write a program to get the point where two linked lists intersect each other.
 */


public class IntersectPoint {
    public static void main(String[] args) {
        
    }

    static int intersectPoint(ListNode head1, ListNode head2)
	{
        
        ListNode h1=head1;
        ListNode h2=head2;

        int h1c=0,h2c=0;
        while (h1!=null) {
            h1=h1.next;
            h1c++;
        }

        while (h2!=null) {
            h2=h2.next;
            h2c++;
        }
        ListNode shor;
        ListNode lon;
        int c=0;
        if (h1c>h2c) {
            lon=head1;
            shor=head2;
            c=h1c-h2c;
        }
        else{
            lon=head2;
            shor=head1;
            c=h2c-h1c;
        }

        while (c>0) {
            lon=lon.next;
            c--;
        }

        while (lon!=null && shor!=null) {
            if (lon==shor) {
                return shor.val;
            }
            lon=lon.next;
            shor=shor.next;
        }



        return -1;
	}
}
