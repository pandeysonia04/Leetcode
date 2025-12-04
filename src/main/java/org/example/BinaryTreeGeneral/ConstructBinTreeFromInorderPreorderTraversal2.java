package org.example.BinaryTreeGeneral;

import java.util.Arrays;

/**
 * Time Complexity: O(n²)
 * Breakdown:
 *
 * findIndex() method: O(n) - In the worst case, we need to scan through the entire inorder array to find the root element
 * Recursive calls: The algorithm makes recursive calls for left and right subtrees
 * Array copying: Arrays.copyOfRange() takes O(n) time to create new arrays
 * Detailed analysis:
 *
 * At each recursive level, we perform O(n) work (finding index + copying arrays)
 * In the worst case (completely unbalanced tree), we have O(n) recursive levels
 * Total: O(n) × O(n) = O(n²)
 * Space Complexity: O(n²)
 * Breakdown:
 *
 * Recursion stack: O(n) in the worst case (height of recursion tree)
 * Array copying: At each recursive call, we create new subarrays with Arrays.copyOfRange()
 * Total arrays created: In the worst case, we create O(n) arrays, each potentially of size O(n)
 * Total: O(n²)
 */
public class ConstructBinTreeFromInorderPreorderTraversal2 {
    public static void main(String[] args) {
        ConstructBinTreeFromInorderPreorderTraversal2 obj = new ConstructBinTreeFromInorderPreorderTraversal2();
        TreeNode result = obj.buildTree(new int[]{3,9,20,15,7}, new int[]{9,3,15,20,7});
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length==0 && inorder.length==0){
            return null;
        }
        TreeNode root = new TreeNode(preorder[0]);
        int mid =  findIndex(inorder,preorder[0]);
        root.left = buildTree(Arrays.copyOfRange(preorder, 1, mid+1),
                Arrays.copyOfRange(inorder, 0, mid));
        root.right = buildTree(Arrays.copyOfRange(preorder, mid+1, preorder.length),
                Arrays.copyOfRange(inorder, mid+1, inorder.length));
        return root;

    }

    private int findIndex(int[] inorder, int element) {
        for(int i=0; i<inorder.length; i++){
            if(inorder[i]==element)
                return i;
        }
        return -1;
    }

}
