package org.example.BST;

import org.example.BinaryTreeGeneral.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class MinAbsoluteDifferenceInBST {
    public static void main(String[] args) {
        MinAbsoluteDifferenceInBST obj = new MinAbsoluteDifferenceInBST();
//        TreeNode root = new TreeNode(4);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(6);
//        root.left.left = new TreeNode(1);
//        root.left.right = new TreeNode(3);
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(2);
       int result= obj.getMinimumDifference(root);
       System.out.println(result);
    }
    TreeNode prev = null;
    int min = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        if(root == null)
            return 0;
        inOrder(root);
        return min;

    }
    private void inOrder(TreeNode root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        if(prev!=null){
            min = Math.min(min, Math.abs(prev.val-root.val));
        }
        prev=root;
        inOrder(root.right);
    }
}
