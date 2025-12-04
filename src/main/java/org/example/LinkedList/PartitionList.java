package org.example.LinkedList;

import org.w3c.dom.ls.LSException;

import static org.example.LinkedList.AddTwoNumber.printList;

public class PartitionList {
    public static void main(String[] args) {
        PartitionList obj = new PartitionList();
        ListNode head = new ListNode(1);
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(2);
        ListNode result= obj.partition(head, 3);
        printList(result);
    }
    public ListNode partition(ListNode head, int x) {
        ListNode left = new ListNode(Integer.MIN_VALUE);
        ListNode right = new ListNode(Integer.MIN_VALUE);
        ListNode ltail = left;
        ListNode rtail = right;

        while(head != null){
            if(head.val < x){
                ltail.next = head;
                ltail = ltail.next;
            }
            else{
                rtail.next = head;
                rtail = rtail.next;
            }
            head = head.next;
        }
        ltail.next = right.next;
        rtail.next = null;
        return left.next;
    }
}
