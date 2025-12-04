package org.example.BinaryTreeGeneral;

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
public class PopulatingNextRightPtrInEachNode {
    public static void main(String[] args) {
        PopulatingNextRightPtrInEachNode solution = new PopulatingNextRightPtrInEachNode();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        // root.right.left is null (represented as null in array)
        root.right.right = new Node(7);

        // Connect the next pointers
        Node result = solution.connect(root);

        System.out.println("\nAfter connecting next pointers:");
        printTreeWithNextPointers(result);
    }
    public static void printTreeWithNextPointers(Node root) {
        if (root == null) return;

        Node levelStart = root;
        int level = 1;

        while (levelStart != null) {
            System.out.print("Level " + level + ": ");
            Node current = levelStart;
            Node nextLevelStart = null;

            while (current != null) {
                System.out.print(current.val);
                if (current.next != null) {
                    System.out.print(" -> ");
                } else {
                    System.out.print(" -> null");
                }

                // Find the first node of next level
                if (nextLevelStart == null) {
                    if (current.left != null) {
                        nextLevelStart = current.left;
                    } else if (current.right != null) {
                        nextLevelStart = current.right;
                    }
                }

                current = current.next;
            }
            System.out.println();

            levelStart = nextLevelStart;
            level++;
        }
    }
    public Node connect(Node root) {
         Node leftmostNode = root;
         while(leftmostNode != null){
             Node dummy = new Node(1);
             Node prev = dummy;
             Node current = leftmostNode;
             while(current != null){
                 if(current.left!= null){
                     prev.next = current.left;
                     prev = prev.next;
                 }
                 if(current.right!=null){
                     prev.next = current.right;
                     prev = prev.next;
                 }
                 current = current.next;
             }
             leftmostNode = dummy.next;
         }
         return root;
    }

}
