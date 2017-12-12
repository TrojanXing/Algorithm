class Solution {
    public int rob(TreeNode root) {
        // if(root == null) return 0;
        // if(root.left == null && root.right == null) return root.val;
        // return Math.max(root.val + (root.left != null ? rob(root.left.left) + rob(root.left.right) : 0) + 
        //                (root.right != null ? rob(root.right.left) + rob(root.right.right) : 0), 
        //                 rob(root.left) + rob(root.right));
        int[] rob = robOrNot(root);
        return Math.max(rob[0], rob[1]);
    }
    private int[] robOrNot(TreeNode node) {
        int[] rob = new int[2];
        if(node == null) return rob;
        int[] left = robOrNot(node.left);
        int[] right = robOrNot(node.right);
        rob[0] = node.val + left[1] + right[1];
        rob[1] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        return rob;
    }
}