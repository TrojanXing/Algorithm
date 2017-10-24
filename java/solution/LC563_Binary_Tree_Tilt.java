package java.solution;
import java.dataStructure.*;

public class LC563_Binary_Tree_Tilt {
	 	int sum = 0;
	    public int findTilt(TreeNode root) {
	        int temp = sumTree(root);
	        return sum;
	    }
	    
	    private int sumTree(TreeNode root) {
	        if(root == null) return 0;
	        if(root.left == null && root.right == null) return root.val;
	        int l = sumTree(root.left);
	        int r = sumTree(root.right);
	        sum += Math.abs(r - l);
	        return root.val + r + l;
	    }
}

