package java.dataStructure;
/**
 * This data structure is for LC116
 * 
 * @author lixing
 *
 */
public class TreeLinkNode {
    public int val;
    public TreeLinkNode left, right, next;
    public TreeLinkNode(int x) { val = x; }

    
    public String serialize(TreeNode root) {
        if(root == null) return "";
        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> queue = new LinkedList();
        queue.offer(root);
        sb.append(root.val);
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if(node.left != null) {
                    queue.offer(node.left);
                    sb.append("," + node.left.val);
                } else {
                    sb.append(",#");
                }
                if(node.right != null) {
                    queue.offer(node.right);
                    sb.append("," + node.right.val);
                } else {
                    sb.append(",#");
                }
            }
        }
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.length() == 0) return null;
        String[] nodes = data.split(",");
		if (nodes.length == 1) return new TreeNode(Integer.parseInt(nodes[0]));
		TreeNode root = new TreeNode(Integer.parseInt(nodes[0]));
		Queue<TreeNode> queue = new LinkedList();
		queue.offer(root);
		for (int i = 1; i < nodes.length; i++) {
			TreeNode node = queue.poll();
			if (!nodes[i].equals("#")) {
				node.left = new TreeNode(Integer.parseInt(nodes[i]));
				queue.offer(node.left);
			}
			i++;
			if (i < nodes.length && !nodes[i].equals("#")) {
				node.right = new TreeNode(Integer.parseInt(nodes[i]));
				queue.offer(node.right);
			}
		}
		return root;
    }
}