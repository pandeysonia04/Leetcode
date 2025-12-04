package org.example.LinkedList;

import static org.example.LinkedList.AddTwoNumber.printList;

public class RemoveNthNode {
    public static void main(String[] args) {
    RemoveNthNode obj = new RemoveNthNode();
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);
    ListNode result = obj.removeNthFromEnd(head, 2);
    printList(result);
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyNode = new ListNode(Integer.MIN_VALUE);
        dummyNode.next = head;
        ListNode ptr1= dummyNode;
        ListNode ptr2 = dummyNode;
        for(int i =0; i<=n; i++){
            ptr2 = ptr2.next;
        }
        while(ptr2!=null){
            ptr1= ptr1.next;
            ptr2 = ptr2.next;
        }
        ptr1.next= ptr1.next.next;
        return  dummyNode.next;
    }

}
