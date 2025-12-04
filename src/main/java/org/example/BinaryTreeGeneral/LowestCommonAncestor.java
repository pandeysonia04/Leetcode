package org.example.BinaryTreeGeneral;

import com.sun.source.tree.Tree;

public class LowestCommonAncestor {
    public static void main(String[] args) {
        LowestCommonAncestor lowestCommonAncestor = new LowestCommonAncestor();
        TreeNode root = new TreeNode(3);
        // Level 1
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);

        // Level 2
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);

        // Level 3
        // root.left.left.left = null (represented as null in array)
        // root.left.left.right = null (represented as null in array)
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);
        TreeNode p = new TreeNode(5);
        TreeNode q = new TreeNode(1);
        TreeNode result = lowestCommonAncestor.lowestCommonAncestor(root, p, q);
        System.out.print("result"+result.val);

    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode curr = root;
        while(curr!=null){
            if(p.val<curr.val && q.val<curr.val){
                curr = curr.left;
            }
            else if(p.val>curr.val && q.val>curr.val){
                curr = curr.right;
            }
        }
        return curr;
    }
}
