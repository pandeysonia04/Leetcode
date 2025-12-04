package org.example.LinkedList;

import static org.example.LinkedList.AddTwoNumber.printList;

public class LinkListReversalWithoutExtraSpace {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(3);
        node1.next = new ListNode(4);
        node1.next.next = new ListNode(7);
        node1.next.next.next = new ListNode(1);
        LinkListReversalWithoutExtraSpace obj = new LinkListReversalWithoutExtraSpace();
        ListNode result = obj.reverseBetween(node1);
        printList(result);

    }
    public ListNode reverseBetween(ListNode head) {
        ListNode currNode = head;
        ListNode preNode = null;
        while(currNode != null){
            ListNode nextNode = currNode.next;
            currNode.next = preNode;
            preNode = currNode;
            currNode = nextNode;
        }
        //Update head
        head = preNode;
        return head;
    }
}
