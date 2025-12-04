package org.example.BinaryTreeGeneral;
/*
Morris Algorithm
(Optimized Morris-like Traversal)
1.Start from the root node.

2.If the current node has a left child:

  -Find the rightmost node of the left subtree.
  -Attach that node’s right to the current node’s right subtree.
  -Move the left subtree to the right and set left = null.
3.Move to the right child and repeat.
*/

public class FlattenBinaryTreeToLinkedList {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(6);
        FlattenBinaryTreeToLinkedList obj = new FlattenBinaryTreeToLinkedList();
    }
    public void flatten(TreeNode root) {
        TreeNode current = root;
        while(current != null){
            if(current.left != null){
                TreeNode temp = current.left;
                while(temp.right!=null){
                    temp = temp.right;
                }
                temp.right = current.right;
                current.right = current.left;
                current.left = null;
            }
            current = current.right;
        }
    }
}
