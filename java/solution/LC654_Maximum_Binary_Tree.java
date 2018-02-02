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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }
    
    private TreeNode helper(int[] nums, int left, int right) {
        if(left > right) return null;
        if(left == right) return new TreeNode(nums[left]);
        int max = Integer.MIN_VALUE;
        int index = -1;
        for(int i = left; i <= right; i++) {
            if(nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }
        TreeNode root = new TreeNode(max);
        root.left = helper(nums, left, index - 1);
        root.right = helper(nums, index + 1, right);
        return root;
    }
    
}