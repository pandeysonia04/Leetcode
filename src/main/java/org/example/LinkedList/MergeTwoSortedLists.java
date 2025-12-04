package org.example.LinkedList;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode returnNode = new ListNode(0);
        ListNode headNode = returnNode;

        while(l1!=null && l2!=null){
            if(l1.val <= l2.val){
                returnNode.next=l1;
                l1=l1.next;
            }
            else{
                returnNode.next=l2;
                l2=l2.next;
            }
            returnNode=returnNode.next;
        }
        if(l1==null){
            returnNode.next=l2;
        }
        else if(l2==null){
            returnNode.next=l1;
        }
        return headNode.next;
    }

    public static void main(String[] args) {
        MergeTwoSortedLists result = new MergeTwoSortedLists();
        ListNode l1 = new ListNode(1);
        l1.next= new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode mergeSortedList = result.mergeTwoLists(l1, l2);
        AddTwoNumber.printList(mergeSortedList);
    }
    }

