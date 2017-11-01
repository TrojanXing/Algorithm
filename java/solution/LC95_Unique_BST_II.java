package java.solution;

import java.dataStructure.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class LC95_Unique_BST_II {
	public List<TreeNode> generateTrees(int n) {
        ArrayList<ArrayList<TreeNode>> list = new ArrayList<ArrayList<TreeNode>>(n+1);
        ArrayList<TreeNode> first = new ArrayList<TreeNode>();
        ArrayList<TreeNode> zero = new ArrayList<TreeNode>();
        zero.add(null);
        first.add(new TreeNode(1));
        if(n == 0) return new ArrayList<TreeNode>();
        if(n == 1) return first;
        list.add(zero);
        list.add(first);
        
        for(int i = 2; i <= n; i++) {
            ArrayList<TreeNode> rootList = new ArrayList<TreeNode>();
            list.add(rootList);
            for(int j = 0; j < i; j++) {
                ArrayList<TreeNode> leftList = list.get(j);
                ArrayList<TreeNode> rightList = list.get(i - 1 - j);
                for(TreeNode left : leftList) {
                    for(TreeNode right : rightList) {
                        TreeNode root = new TreeNode(j + 1);
                        root.left = left;
                        root.right = addN(right, j + 1);
                        rootList.add(root);
                    }
                }
            }
        }
        return list.get(n);
    }
    
    private TreeNode addN(TreeNode root, int n) {
        if(root == null) return null;
        TreeNode node = new TreeNode(root.val + n);
        node.left = addN(root.left, n);
        node.right = addN(root.right, n);
        return node;
    }
}
