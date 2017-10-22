package java.solution;
import java.dataStructure.*;
import java.util.LinkedList;
import java.util.List;

public class LC257_BT_Path {
	List<String> list;
    public List<String> binaryTreePaths(TreeNode root) {
        list = new LinkedList<String>();
        if(root != null) {
            buildPathString(root, "");
        }
        return list;
    }
    private void buildPathString(TreeNode root, String s) {
        if(s.length() != 0) {
            s += "->";
        }
        s += root.val;
        if(root.left != null) {
            buildPathString(root.left, s);
        } 
        if(root.right != null) {
            buildPathString(root.right, s);
        }
        if(root.left == null && root.right == null) {
            list.add(s);
        }
    }
}
