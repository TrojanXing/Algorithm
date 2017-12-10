class Solution {
    public boolean isValidBST(TreeNode root) {
        return isValidHelper(root, (long)Integer.MAX_VALUE + 1, (long)Integer.MIN_VALUE - 1);
    }
    private boolean isValidHelper(TreeNode root, long ub, long lb) {
        if(root == null) return true;
        return (root.val < ub && root.val > lb && isValidHelper(root.left, root.val, lb) &&
                isValidHelper(root.right, ub, root.val));
    }
}