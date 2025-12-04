package org.example.BinaryTreeGeneral;


import java.util.LinkedList;
import java.util.Queue;

public class SameTree {
    public static void main(String[] args) {
        SameTree obj = new SameTree();
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(1);
        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(1);
        q.right = new TreeNode(2);
        boolean result=obj.isSameTree(p,q);
        System.out.println("Is Same :" +result);
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> elementQueue = new LinkedList<>();
        elementQueue.add(p);
        elementQueue.add(q);

        while(!elementQueue.isEmpty()){
            TreeNode firstNode = elementQueue.poll();
            TreeNode secondNode = elementQueue.poll();
            if(firstNode==null && secondNode==null){
                continue;
            }
            else if(firstNode==null || secondNode==null || firstNode.val != secondNode.val){
                return false;
            }

            elementQueue.add(firstNode.left);
            elementQueue.add(secondNode.left);
            elementQueue.add(firstNode.right);
            elementQueue.add(secondNode.right);
        }
        return true;
    }
}
