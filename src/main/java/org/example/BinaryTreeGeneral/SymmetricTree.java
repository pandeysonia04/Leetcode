package org.example.BinaryTreeGeneral;

import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree {
    public static void main(String[] args) {
        SymmetricTree obj = new SymmetricTree();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);
        boolean result = obj.isSymmetric(root);
        System.out.print("IS SYMMETRIC: "+result);

    }
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> elementQueue1 = new LinkedList<>();
        Queue<TreeNode> elementQueue2 = new LinkedList<>();

        elementQueue1.add(root.left);
        elementQueue2.add(root.right);
        while(!elementQueue1.isEmpty() && !elementQueue2.isEmpty()){
            TreeNode leftNode = elementQueue1.poll();
            TreeNode rightNode = elementQueue2.poll();
            if(leftNode==null && rightNode==null)
                continue;
            if(leftNode==null || rightNode==null){
                return false;
            }
            if(leftNode.val != rightNode.val){
                return false;
            }
            elementQueue1.add(leftNode.left);
            elementQueue1.add(leftNode.right);
            elementQueue2.add(rightNode.right);
            elementQueue2.add(rightNode.left);

        }
        return true;
    }
}
