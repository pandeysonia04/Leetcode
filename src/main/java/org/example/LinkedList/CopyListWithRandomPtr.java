package org.example.LinkedList;

import static org.example.LinkedList.AddTwoNumber.printList;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
public class CopyListWithRandomPtr {
    public Node copyRandomList(Node head) {
        if(head == null)
            return null;
        Node curr = head;
        while(curr !=null){
            Node newNode = new Node(curr.val);
            newNode.next = curr.next;
            curr.next = newNode;
            curr = newNode.next;
        }
        curr = head;
        while(curr !=null){
            if(curr.random !=null){
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }
        curr = head;
        Node newHead = head.next;
        Node newCurr = newHead;

        while(curr!=null){
            curr.next= newCurr.next;
            curr=curr.next;
           if(curr!=null){
               newCurr.next=curr.next;
               newCurr=newCurr.next;
           }
        }
        return newHead;
    }

    public static void main(String[] args) {
        CopyListWithRandomPtr obj= new CopyListWithRandomPtr();
        // Create the test data: [[7,null],[13,0],[11,4],[10,2],[1,0]]
        // First, create all nodes
        Node node1 = new Node(7);   // index 0
        Node node2 = new Node(13);  // index 1
        Node node3 = new Node(11);  // index 2
        Node node4 = new Node(10);  // index 3
        Node node5 = new Node(1);   // index 4

        // Set up the next pointers (linked list chain)
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = null;

        // Set up the random pointers based on [[7,null],[13,0],[11,4],[10,2],[1,0]]
        node1.random = null;   // [7,null] - random points to null
        node2.random = node1;  // [13,0] - random points to index 0 (node with value 7)
        node3.random = node5;  // [11,4] - random points to index 4 (node with value 1)
        node4.random = node3;  // [10,2] - random points to index 2 (node with value 11)
        node5.random = node1;  // [1,0] - random points to index 0 (node with value 7)

        Node head = node1;

        // Print original list to verify
        System.out.println("Original list:");
        printList(head);

        // Call the copy function
        Node copiedHead = obj.copyRandomList(head);

        // Print copied list (once you implement the function)
        System.out.println("\nCopied list:");
        printList(copiedHead);
    }
        public static void printList(Node head) {
            Node current = head;
            int index = 0;
            while (current != null) {
                String randomVal = (current.random != null) ? String.valueOf(current.random.val) : "null";
                System.out.println("Node " + index + ": val=" + current.val + ", random points to node with val=" + randomVal);
                current = current.next;
                index++;
            }
        }

    }

