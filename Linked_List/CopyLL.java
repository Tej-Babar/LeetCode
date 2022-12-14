/*
    138. Copy List with Random Pointer
    
 * Construct a deep copy of the list. 
 * The deep copy should consist of exactly n brand new nodes, where each new node has 
 * its value set to the value of its corresponding original node. 
 * Both the next and random pointer of the new nodes should point to new nodes in the 
 * copied list such that the pointers in the original list and copied list represent 
 * the same list state. None of the pointers in the new list should point to nodes in 
 * the original list.
 */

import java.util.HashMap;

public class CopyLL {
    public static void main(String[] args) {
        
    }

    public ListNode copyRandomList(ListNode head) {
        if (head==null) {
            return null;
        }
        HashMap<ListNode,ListNode> hm=new HashMap<>();
        ListNode nhead=new ListNode(head.val);
        hm.put(head, nhead);
        ListNode temp=head.next;
        ListNode ptr=nhead;

        while (temp!=null) {
            ListNode node=new ListNode(temp.val);
            hm.put(temp, node);
            ptr.next=node;
            ptr=ptr.next;
            temp=temp.next;
        }
        ptr=nhead;
        while (head!=null) {
            ptr.random = hm.get(head.random);
            ptr=ptr.next;
            head=head.next;
        }


        return nhead;
    }
}
