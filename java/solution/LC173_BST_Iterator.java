package solution;

import java.util.Stack;
import dataStructure.*;

public class LC173_BST_Iterator {
    Stack<TreeNode> stack;
    
    public void BSTIterator(TreeNode root) {
        stack = new Stack<TreeNode>();
        while(root != null){
            stack.push(root);
            root = root.left;
        }
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode node = stack.pop();
        int min = node.val;
        node = node.right;
        while(node != null){
            stack.push(node);
            node = node.left;
        }
        return min;
    }
}