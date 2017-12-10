class Solution {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList();
        int res = root.val;
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            res = queue.peek().val;
            for(int i = 0; i < size; i++){
                TreeNode node = queue.poll();
                if(node.left != null) queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);
            }
        }
        return res;
    }
}