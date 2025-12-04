package org.example.LinkedList;

import static org.example.LinkedList.AddTwoNumber.printList;

public class RotateList {
    public static void main(String[] args) {
        RotateList obj = new RotateList();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode result = obj.rotateRight(head, 2);
        printList(result);
    }
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null){
            return head;
        }
        if(head.next == null)
            return head;
        int len = 1;
        ListNode tail = head;
        while(tail.next != null){
            tail = tail.next;
            len++;
        }
        k = k%len;
        if(k == 0)
            return head;
        ListNode newHead;
        ListNode currNode = head;
        for(int i=0; i<len-k-1; i++){
            currNode = currNode.next;
        }
        newHead = currNode.next;
        tail.next = head;
        currNode.next = null;
        return newHead;
    }
}
