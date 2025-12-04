package org.example.LinkedList;
// Define the ListNode class
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
    ListNode(int val, ListNode next) {
        this.val = val; this.next = next;
    }
}
public class LinkListCycle {
    public boolean hasCycleFloyd(ListNode head) {

        // Start a slow and fast pointer
        ListNode slowPtr = head;
        ListNode fastPtr = head;

        while (slowPtr != null
                && fastPtr != null
                && fastPtr.next != null) {

            // Advance both the pointers
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;

            // If they meet, means we found a loop
            if (slowPtr == fastPtr) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        LinkListCycle linkListCycle = new LinkListCycle();
        // Test case: [3,2,0,-4], pos = 1
        // Create nodes with the specified values
        ListNode head = new ListNode(3);        // position 0
        ListNode node1 = new ListNode(2);       // position 1
        ListNode node2 = new ListNode(0);       // position 2
        ListNode node3 = new ListNode(-4);      // position 3

        // Link the nodes in sequence
        head.next = node1;
        node1.next = node2;
        node2.next = node3;

        // Create cycle: last node points back to position 1 (node with value 2)
        node3.next = node1;

        // Pass the head node to the method
        boolean hasCycle = linkListCycle.hasCycleFloyd(head);
        System.out.println("Has Cycle: " + hasCycle);

    }

}
