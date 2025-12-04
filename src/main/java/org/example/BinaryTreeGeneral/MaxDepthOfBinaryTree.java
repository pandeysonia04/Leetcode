package org.example.BinaryTreeGeneral;

import java.util.LinkedList;
import java.util.Queue;

public class MaxDepthOfBinaryTree {
    public static void main(String[] args) {
        MaxDepthOfBinaryTree maxDepthOfBinaryTree = new MaxDepthOfBinaryTree();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        int depth = maxDepthOfBinaryTree.maxDepth(root);
        System.out.println("Max depth: " + depth); // Output: 3
    }
    public int maxDepth(TreeNode root) {
        if (root == null) return 0; // Handle null root
        Queue<TreeNode> elementQueue = new LinkedList<>();
        elementQueue.add(root);
        int countLevel = 0;
        while(true){
            int countNodeLevel= elementQueue.size();
            if(countNodeLevel == 0){
                return  countLevel;
            }
            while (countNodeLevel > 0){
                TreeNode treeNode = elementQueue.poll();
                if(treeNode.left!=null){
                    elementQueue.add(treeNode.left);
                }
                if(treeNode.right != null){
                    elementQueue.add(treeNode.right);
                }
                countNodeLevel--;
            }
            countLevel++;
        }

    }
}
