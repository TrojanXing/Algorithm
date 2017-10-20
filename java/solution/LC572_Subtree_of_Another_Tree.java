package java.solution;

public class LC572_Subtree_of_Another_Tree {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s == null || t == null) {
            return false;
        }

        return compareTree(s, t) || isSubtree(s.left, t) || isSubtree(s.right, t);
    }
    private boolean compareTree(TreeNode s, TreeNode t) {
        if(s == null && t == null) return true;
        if(s == null ^ t == null || s.val != t.val){
            return false;
        }
        return compareTree(s.left, t.left) && compareTree(s.right, t.right);
    }
}
