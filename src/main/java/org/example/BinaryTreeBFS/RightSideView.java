package org.example.BinaryTreeBFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.example.BinaryTreeGeneral.TreeNode;

public class RightSideView {
    public static void main(String[] args) {
        RightSideView rightSideView = new RightSideView();
        TreeNode root = new TreeNode(1);
        // Level 1
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        // Level 2
        // root.left.left = null (represented as null in array)
        root.left.right = new TreeNode(5);
        // root.right.left = null (represented as null in array)
        root.right.right = new TreeNode(4);

        List<Integer> result = rightSideView.rightSideView(root);
        System.out.println("Result:");
        for(int res: result){
            System.out.println(res);
        }


    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> resultNodes = new ArrayList<>();
        if(root==null){
            return resultNodes;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int levelSize = queue.size();
            int lastValue = 0;

            for(int i=0; i<levelSize; i++){
                TreeNode node = queue.poll();
                lastValue = node.val;
                if(node.left != null )
                    queue.offer(node.left);
                if(node.right !=null)
                    queue.offer(node.right);
            }
            resultNodes.add(lastValue);

        }
        return resultNodes;
    }
}
