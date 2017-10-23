package java.solution;
import java.dataStructure.*;

public class LC538_Convert_BST_to_Greater_Tree {
	int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        iterTree(root);
        return root;
    }
    
    private void iterTree(TreeNode node) {
        if(node == null) return;
        if(node.right != null) {
            iterTree(node.right);
        }
        sum += node.val;
        node.val = sum;
        
        iterTree(node.left);
    }
}
