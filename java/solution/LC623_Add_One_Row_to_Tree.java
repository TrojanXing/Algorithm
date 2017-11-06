package java.solution;

import java.dataStructure.*;

public class LC623_Add_One_Row_to_Tree {
    public TreeNode addOneRow(TreeNode root, int v, int d) {
        return helper(root, v, d, true);
    }
    private TreeNode helper(TreeNode root, int v, int d, boolean left) {
        if(d == 1) {
            TreeNode node = new TreeNode(v);
            if(left) node.left = root;
            else node.right = root;
            return node;
        }
        if(root == null) return null;
        root.left = helper(root.left, v, d-1, true);
        root.right = helper(root.right, v, d-1, false);
        return root;
    }
}