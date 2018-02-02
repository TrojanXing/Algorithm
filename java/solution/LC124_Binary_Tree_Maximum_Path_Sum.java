
class Solution {
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        int[] max = maxHelper(root);
        return max[1];
    }
    
    private int[] maxHelper(TreeNode node) {
        if(node == null){
            return new int[] {Integer.MIN_VALUE, Integer.MIN_VALUE};  
        } 
        //max = Math.max(max, node.val);
        if(node.left == null && node.right == null) {
            return new int[]{node.val, node.val};
        }
        int[] res = new int[2];
        int[] left = maxHelper(node.left);
        int[] right = maxHelper(node.right);
        res[0] = Math.max(Math.max(left[0], right[0]), 0) + node.val;
        res[1] = Math.max(Math.max(node.val + Math.max(left[0], 0) + Math.max(right[0], 0), left[1]), right[1]);
        return res;
    }
}