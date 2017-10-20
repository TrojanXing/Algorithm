package java.solution;

//import java.dataStructure.TreeLinkNode;

class LC_116_Populating_Next_Right_Pointers {
	public void connect(TreeLinkNode root) {
        rebuildTree(root, null);
        return;
    }
    private void rebuildTree(TreeLinkNode root, TreeLinkNode next){
        if(root == null) return;
        root.next = next;
        rebuildTree(root.left, root.right);
        rebuildTree(root.right, next == null? null:next.left);
        return;
    }
}

