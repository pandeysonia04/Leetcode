package org.example.BinaryTreeGeneral;

import java.util.Stack;

public class PathSum {
    public static void main(String[] args) {
    PathSum pathSum = new PathSum();
    TreeNode root = new TreeNode(5);
    root.left = new TreeNode(4);
    root.right = new TreeNode(8);
    root.left.left = new TreeNode(11);
    root.right.left = new TreeNode(13);
    root.right.right = new TreeNode(4);
    root.left.left.left = new TreeNode(7);
    root.left.left.right = new TreeNode(2);
    root.right.right.right = new TreeNode(1);
    boolean result = pathSum.hasPathSum(root, 22);
    System.out.print(result);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null)
            return false;
        Stack<TreeNode> path = new Stack<>();
        Stack<Integer> sum = new Stack<>();
        path.push(root);
        sum.push(root.val);
        while(!path.isEmpty()){
            TreeNode tempPath = path.pop();
            int tempVal = sum.pop();
            if(tempPath.left == null && tempPath.right==null && tempVal==targetSum){
                return true;
            }
            if(tempPath.right!=null){
                path.push(tempPath.right);
                sum.push(tempVal+tempPath.right.val);
            }
            if(tempPath.left!=null){
                path.push(tempPath.left);
                sum.push(tempVal+tempPath.left.val);
            }
        }
        return false;
    }
}
