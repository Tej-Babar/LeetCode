
public class ListNode {
        int val;
        ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        public static void main(String[] args) {
            
        }
    }

    class Node {
        int val;
        Node next;
        Node child;
         Node() {}
         Node(int val) { this.val = val; }
        Node(int val, Node next,Node child) { 
            this.val = val; 
            this.next = next;
            this.child=child;
         }
        public static void main(String[] args) {
            
        }
    }
