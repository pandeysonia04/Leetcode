package org.example.BinaryTreeBFS;

import org.example.BinaryTreeGeneral.TreeNode;

import java.util.*;

public class zigzagLevelOrderTraversal {
    public static void main(String[] args) {
        zigzagLevelOrderTraversal bTree = new zigzagLevelOrderTraversal();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        List<List<Integer>> result =bTree.zigzagLevelOrder(root);
        System.out.println(result);

    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> zizagList = new ArrayList<>();
        if(root == null)
            return zizagList;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean flag = false;
        while(!queue.isEmpty()){
            Stack<Integer> reverseStack = new Stack<>();
            List<Integer> individualList = new ArrayList<>();
            int level = queue.size();
            for(int i=0; i<level; i++){
                TreeNode treeNode = queue.poll();
                if(flag)
                    reverseStack.add(treeNode.val);
                else
                    individualList.add(treeNode.val);
                if(treeNode.left != null)
                    queue.add(treeNode.left);
                if (treeNode.right != null)
                    queue.add(treeNode.right);
            }
            flag = !flag;
            while (!reverseStack.isEmpty())
                individualList.add(reverseStack.pop());
            zizagList.add(individualList);
        }
        return  zizagList;
    }
}
