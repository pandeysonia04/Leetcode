package org.example.BinaryTreeGeneral;

import java.util.HashMap;
import java.util.Map;

public class ConstructBinTreeFromInorderPreorderTraversal {
    public static void main(String[] args) {
        ConstructBinTreeFromInorderPreorderTraversal obj = new ConstructBinTreeFromInorderPreorderTraversal();
        TreeNode result = obj.buildTree(new int[]{3,9,20,15,7}, new int[]{9,3,15,20,7});
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> inOrderMap = new HashMap<>();
        for(int i=0; i<inorder.length; i++){
            inOrderMap.put(inorder[i], i);
        }
        return splitTree(preorder, inOrderMap, 0, 0, inorder.length-1);
    }

    private TreeNode splitTree(int[] preorder, Map<Integer, Integer> inOrderMap, int rootIndex, int left, int right) {
        TreeNode rootNode = new TreeNode(preorder[rootIndex]);
        int mid = inOrderMap.get(preorder[rootIndex]);
        if(mid>left){
            rootNode.left = splitTree(preorder,inOrderMap,rootIndex+1, left, mid-1);
        }
        if(mid<right){
            rootNode.right = splitTree(preorder, inOrderMap, rootIndex+mid-left+1, mid+1, right);
        }

        return rootNode;
    }
}
