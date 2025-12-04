package org.example.BinaryTreeBFS;

import com.sun.source.tree.Tree;
import org.example.BinaryTreeGeneral.TreeNode;

import java.util.*;

public class BinaryTreeLevelOrderTraversal {
    public static void main(String[] args) {
        BinaryTreeLevelOrderTraversal bTree = new BinaryTreeLevelOrderTraversal();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        List<List<Integer>> result =bTree.levelOrder(root);
        System.out.println(result);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> resultList = new ArrayList<>();
        if(root == null)
            return resultList;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int levelSize = queue.size();
            ArrayList<Integer> individualList = new ArrayList();
            for(int i=0; i<levelSize; i++){
                TreeNode treeNode = queue.poll();
                individualList.add(treeNode.val);
                if(treeNode.left != null){
                    queue.add(treeNode.left);
                }
                if(treeNode.right != null){
                    queue.add(treeNode.right);
                }
            }
            resultList.add(individualList);
        }
        return  resultList;
    }
}
