package java.solution;

class LC687_Longest_Univalue_Path {
    int longest = 0;
    public int longestUnivaluePath(TreeNode root) {
        if(root == null || (root.left == null && root.right == null)) return 0;
        int temp = helper(root);
        return longest - 1;
    }
    private int helper(TreeNode node) {
        if(node == null) return 0;
        if(node.left == null && node.right == null) return 1;
        int l = helper(node.left);
        int r = helper(node.right);
        int res = 1;
        res += ((l != 0 && node.left.val == node.val) ? l : 0) +
                ((r != 0 && node.right.val == node.val)? r : 0);
        longest = Math.max(longest, res);
        return Math.max((l != 0 && node.left.val == node.val) ? l : 0,
                (r != 0 && node.right.val == node.val)? r : 0) + 1;
    }
}