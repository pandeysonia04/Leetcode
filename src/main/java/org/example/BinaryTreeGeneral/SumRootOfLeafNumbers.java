package org.example.BinaryTreeGeneral;

public class SumRootOfLeafNumbers {
    public static void main(String[] args) {
    SumRootOfLeafNumbers obj = new SumRootOfLeafNumbers();
    TreeNode root = new TreeNode(4);
    root.left = new TreeNode(9);
    root.right = new TreeNode(0);
    root.left.left = new TreeNode(5);
    root.left.right = new TreeNode(1);
    int result = obj.sumNumbers(root);
    System.out.print(result);
    }
    public int sumNumbers(TreeNode root) {
        if(root == null)
            return 0;
        return sumOfLeafNode(root, 0);

    }

    private int sumOfLeafNode(TreeNode current, int num) {
        if(current==null)
            return 0;
        num = num* 10 +current.val;
        if(current.left==null && current.right==null){
            return num;
        }
        return sumOfLeafNode(current.left, num)+sumOfLeafNode(current.right, num);
    }
}
