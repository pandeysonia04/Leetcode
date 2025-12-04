package org.example.BinaryTreeGeneral;

import java.util.HashMap;
import java.util.Map;

/*
Time: O(n) - Each node processed once, O(1) lookups
Space: O(n) - HashMap + recursion stack
 */
public class ConstructBinTreeFromInorderPreorderTraversal3 {
    private Map<Integer, Integer> inorderMap;
    public static void main(String[] args) {
        ConstructBinTreeFromInorderPreorderTraversal3 obj = new ConstructBinTreeFromInorderPreorderTraversal3();
        TreeNode result = obj.buildTree(new int[]{3,9,20,15,7}, new int[]{9,3,15,20,7});
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        inorderMap = new HashMap<>();
        for(int i=0; i<inorder.length; i++){
            inorderMap.put(inorder[i], i);
        }
        return buildTreeHelper(preorder, 0, preorder.length-1, inorder, 0, inorder.length-1);
    }

    private TreeNode buildTreeHelper(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd) {
        if (preStart > preEnd || inStart > inEnd) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[preStart]);
        int mid = inorderMap.get(preorder[preStart]);
        int leftSize = mid-inStart;
        root.left = buildTreeHelper(preorder, preStart+1,
                preStart+leftSize, inorder, inStart, mid-1);
        root.right = buildTreeHelper(preorder, preStart+leftSize+1, preEnd,
                inorder, mid+1, inEnd);
        return root;
    }
}
