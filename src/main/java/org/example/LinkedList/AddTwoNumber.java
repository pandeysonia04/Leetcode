package org.example.LinkedList;

public class AddTwoNumber {
    public static void main(String[] args) {
    AddTwoNumber number = new AddTwoNumber();
        // Test data setup: l1 = [2,4,3], l2 = [5,6,4]
        // Create first linked list: 2 -> 4 -> 3
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        // Create second linked list: 5 -> 6 -> 4
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        ListNode result = number.addTwoNumbers(l1, l2);
        // Print the result
        System.out.print("Result: ");
        printList(result);
    }
    // Helper method to print the linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        System.out.print("[");
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) {
                System.out.print(",");
            }
            current = current.next;
        }
        System.out.println("]");
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode ptr = result;
        int carry = 0;
        while(l1!=null || l2!=null){
            int sum = carry;
            if(l1!=null){
                    sum+=l1.val;
                    l1=l1.next;
            }
            if (l2 != null) {
                sum+=l2.val;
                l2=l2.next;
            }
            carry = sum/10;
            sum = sum%10;
            ptr.next = new ListNode(sum);
            ptr = ptr.next;
            }
        if(carry ==1){
            ptr.next = new ListNode(1);
        }
        return result.next;

        }
    }


//public class ListNode {
//      int val;
//      ListNode next;
//      ListNode() {}
//     ListNode(int val) { this.val = val; }
//     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// }
