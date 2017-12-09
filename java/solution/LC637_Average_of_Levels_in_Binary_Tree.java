package java.solution;

class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new LinkedList();
        if(root == null) return list;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            long sum = 0;
            for(int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if(node.left != null) queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);
                sum += node.val;
            }
            list.add((double)sum / size);
        }
        return list;
    }
}