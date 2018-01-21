/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int findSecondMinimumValue(TreeNode root) {
        if(root == null || (root.left == null && root.right == null)) return -1;
        
        int left = root.left.val;
        int right = root.right.val;
        if(left == root.val) left = findSecondMinimumValue(root.left);
        if(right == root.val) right = findSecondMinimumValue(root.right);
        
        if(left == -1 && right == -1) return -1;
        else if(left == -1 ^ right == -1) return Math.max(left, right);
        else return Math.min(left, right);
    }
}