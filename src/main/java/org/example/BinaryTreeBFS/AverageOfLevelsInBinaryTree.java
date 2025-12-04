package org.example.BinaryTreeBFS;

import org.example.BinaryTreeGeneral.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevelsInBinaryTree {
    public static void main(String[] args) {
        AverageOfLevelsInBinaryTree av = new AverageOfLevelsInBinaryTree();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        List<Double> result= av.averageOfLevels(root);
        System.out.println("Result averge");
        for (Double d: result){
            System.out.println(d);
        }
    }
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> resultNode = new ArrayList<>();
        if(root==null)
            return resultNode;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int levelSize = queue.size();
            double sum = 0;
            for(int i=0; i<levelSize; i++){
                TreeNode curr = queue.poll();
                sum+=curr.val;
                if(curr.left!=null)
                    queue.offer(curr.left);
                if(curr.right!=null)
                    queue.offer(curr.right);
            }
            double average = sum/levelSize;
            resultNode.add(average);
        }
        return resultNode;

    }
}
