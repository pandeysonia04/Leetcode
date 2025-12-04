package org.example.BST;
import org.example.BinaryTreeGeneral.TreeNode;

public class ValidBinarySearchTree {
    public static void main(String[] args) {
    TreeNode root = new TreeNode(5);
    root.left = new TreeNode(3);
    root.right = new TreeNode(7);
    root.right.left = new TreeNode(4);
    root.right.right = new TreeNode(8);
    ValidBinarySearchTree validBinarySearchTree = new ValidBinarySearchTree();
    boolean result = validBinarySearchTree.isValidBST(root);
    System.out.println("Result: "+result);

    }
    public boolean isValidBST(TreeNode root) {
        return validBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    private boolean validBST(TreeNode node, long left, long right){
        if(node == null)
            return true;
        if(!(node.val>left && node.val<right))
            return false;
        return (validBST(node.left, left, node.val) && validBST(node.right, node.val, right));
    }
}
