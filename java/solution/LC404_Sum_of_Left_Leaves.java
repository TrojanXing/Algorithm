class Solution {
    private int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null) return 0;
        return helper(root.left, true) + helper(root.right, false);
    }
    
    private int helper(TreeNode node, boolean left) {
        if(node == null) return 0;
        if(node.left == null && node.right == null) return left? node.val : 0;
        return helper(node.left, true) + helper(node.right, false); 
    }
}