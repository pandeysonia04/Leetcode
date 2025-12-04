package org.example.BST;

import org.example.BinaryTreeGeneral.TreeNode;

import java.util.Stack;

public class KthSmallestElement {
    public static void main(String[] args) {
        KthSmallestElement kthSmallestElement = new KthSmallestElement();
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.left.left.left = new TreeNode(1);
       int result = kthSmallestElement.kthSmallest(root, 3);
       System.out.println("Result: " + result);
    }
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;

        while (true) {
            // Go to the leftmost node
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            // Process the current node
            current = stack.pop();
            k--;

            // If we've reached the kth element, return it
            if (k == 0) {
                return current.val;
            }

            // Move to the right subtree
            current = current.right;
        }
    }
}
