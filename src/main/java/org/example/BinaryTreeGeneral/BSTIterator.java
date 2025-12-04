package org.example.BinaryTreeGeneral;

import java.util.Stack;

public class BSTIterator {
    private Stack<TreeNode> stack = new Stack<>();
    public BSTIterator(TreeNode root) {
        pushAll(root);
    }

    private void pushAll(TreeNode root) {
        while(root!=null){
            stack.push(root);
            root=root.left;
        }
    }

    public int next() {
        TreeNode tmpNode = stack.pop();
        pushAll(tmpNode.right);
        return tmpNode.val;
    }

    public boolean hasNext() {
    if(!stack.isEmpty())
        return true;
    return false;
    }

}
