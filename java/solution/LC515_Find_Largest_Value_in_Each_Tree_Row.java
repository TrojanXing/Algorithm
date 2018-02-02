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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new LinkedList();
        if(root == null) return res;
        Queue<TreeNode> queue = new LinkedList();
        queue.offer(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            int max = Integer.MIN_VALUE;
            for(int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                max = Math.max(max, node.val);
                if(node.left != null) queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);
            }
            res.add(max);
        }
        return res;
    }
}