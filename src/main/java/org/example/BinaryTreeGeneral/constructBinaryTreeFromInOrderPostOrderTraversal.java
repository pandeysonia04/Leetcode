package org.example.BinaryTreeGeneral;

import java.util.HashMap;
import java.util.Map;

public class constructBinaryTreeFromInOrderPostOrderTraversal {
    private Map<Integer, Integer> inOrderMap;
    public static void main(String[] args) {
        constructBinaryTreeFromInOrderPostOrderTraversal obj = new constructBinaryTreeFromInOrderPostOrderTraversal();
        TreeNode result = obj.buildTree(new int[]{9,3,15,20,7}, new int[]{9,15,7,20,3});


    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        inOrderMap = new HashMap<>();
        for(int i=0; i<inorder.length; i++){
            inOrderMap.put(inorder[i], i);
        }
        return buildTreeHelper(postorder, 0, postorder.length-1, inorder, 0, inorder.length-1);
    }

    private TreeNode buildTreeHelper(int[] postorder, int postStart, int postEnd, int[] inorder, int inStart, int inEnd) {
        if(postStart>postEnd || inStart > inEnd)
            return null;
        TreeNode root = new TreeNode(postorder[postEnd]);
        int mid = inOrderMap.get(postorder[postEnd]);
        int leftSize = mid - inStart;
        root.left = buildTreeHelper(postorder, postStart, postStart+leftSize-1,
                inorder, inStart, mid-1);
        root.right = buildTreeHelper(postorder, postStart+leftSize, postEnd-1,
                inorder, mid+1, inEnd);

        return root;
    }
}
