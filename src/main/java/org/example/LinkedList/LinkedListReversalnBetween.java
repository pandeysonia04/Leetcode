package org.example.LinkedList;

import static org.example.LinkedList.AddTwoNumber.printList;

public class LinkedListReversalnBetween {
    public static void main(String[] args) {
    LinkedListReversalnBetween obj = new LinkedListReversalnBetween();
    ListNode node1 = new ListNode(1);
    node1.next = new ListNode(2);
    node1.next.next = new ListNode(3);
    node1.next.next.next = new ListNode(4);
    node1.next.next.next.next = new ListNode(5);
    ListNode  result = obj.reverseBetween(node1, 2, 4);
    printList(result);

    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head.next == null)
                return head;
        ListNode dummyHead = new ListNode(Integer.MIN_VALUE);
        dummyHead.next = head;
        ListNode leftPre = dummyHead;
        ListNode currNode = head;

        for(int i=0; i<left-1; i++){
            leftPre = leftPre.next;
            currNode = currNode.next;
        }
        ListNode sublistHead = currNode;
        ListNode preNode = null;
        for(int i=0; i<right-left+1; i++){
            ListNode nextNode = currNode.next;
            currNode.next = preNode;
            preNode = currNode;
            currNode = nextNode;
        }
        //Join the pieces
        leftPre.next = preNode;
        sublistHead.next = currNode;
        return dummyHead.next;

    }
}
