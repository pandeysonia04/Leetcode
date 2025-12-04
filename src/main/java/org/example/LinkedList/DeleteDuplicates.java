package org.example.LinkedList;

import java.util.List;

import static org.example.LinkedList.AddTwoNumber.printList;

public class DeleteDuplicates {
    public static void main(String[] args) {
        DeleteDuplicates obj = new DeleteDuplicates();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next= new ListNode(5);
        ListNode result = obj.deleteDuplicates(head);
        printList(result);
    }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(Integer.MIN_VALUE);
        dummy.next = head;
        ListNode currptr = head;
        ListNode prevPtr = dummy;

        while(currptr != null){
            if(currptr.next != null && currptr.val == currptr.next.val){
                while(currptr.next != null && currptr.val == currptr.next.val){
                    currptr = currptr.next;
                }
                prevPtr.next = currptr.next;
            }
            else{
                prevPtr = prevPtr.next;
            }
            currptr = currptr.next;
        }
        return dummy.next;
    }
}
