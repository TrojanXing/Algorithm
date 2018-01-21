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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList();
        if(root == null) return res;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        boolean direction = true;
        queue.offer(root);
        
        while(!queue.isEmpty()) {
            int size = queue.size();
            LinkedList<Integer> list = new LinkedList();
            for(int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if(node.left != null) queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);
                
                if(direction) list.add(node.val);
                else list.addFirst(node.val);
            }
            res.add(list);
            direction = !direction;
        }
        
        return res;
    }
}