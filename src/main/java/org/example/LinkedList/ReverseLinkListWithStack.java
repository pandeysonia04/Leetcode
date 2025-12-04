package org.example.LinkedList;

import java.util.Stack;

import static org.example.LinkedList.AddTwoNumber.printList;

public class ReverseLinkListWithStack {
    public static void main(String[] args) {
    ListNode node1 = new ListNode(3);
    node1.next = new ListNode(4);
    node1.next.next = new ListNode(7);
    node1.next.next.next = new ListNode(1);
    ReverseLinkListWithStack obj = new ReverseLinkListWithStack();
    ListNode result = obj.reverseBetween(node1);
    printList(result);

    }

        public ListNode reverseBetween(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode curr = head;
        while(curr != null){
            stack.push(curr.val);
            curr=curr.next;
        }
        ListNode newList =new ListNode(0);

        ListNode ptr = newList;

        while(!stack.isEmpty()){
            ptr.next = new ListNode(stack.pop());
            ptr = ptr.next;
        }
        return newList.next;
        }
}
