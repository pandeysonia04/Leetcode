package org.example.BinaryTreeGeneral;

import java.util.LinkedList;
import java.util.Queue;

public class InvertBinaryTree {
    public static void main(String[] args) {
        InvertBinaryTree obj = new InvertBinaryTree();
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);
        TreeNode result = obj.invertTree(root);

    }
    public TreeNode invertTree(TreeNode root) {
        Queue<TreeNode> elementQueue = new LinkedList<>();
        if(root == null)
            return root;
        elementQueue.add(root);
        while(!elementQueue.isEmpty()){
            TreeNode treeNode = elementQueue.poll();
            TreeNode temp = treeNode.left;
            treeNode.left = treeNode.right;
            treeNode.right = temp;
            if(treeNode.left!=null){
                elementQueue.add(treeNode.left);
            }
            if(treeNode.right!=null){
                elementQueue.add(treeNode.right);
            }
        }
        return root;
    }
}
