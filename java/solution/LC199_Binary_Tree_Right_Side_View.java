package solution;

import java.util.ArrayList;
import java.util.List;
import dataStructure.TreeNode;

public class LC199_Binary_Tree_Right_Side_View {
    List<Integer> res;
    public List<Integer> rightSideView(TreeNode root) {
        res = new ArrayList<Integer>();
        iterTree(root, 0);
        return res;
    }
    
    private void iterTree(TreeNode node, int dep){
        if(node == null) return;
        if(dep == res.size()){
            res.add(node.val);
        } else {
            res.set(dep, node.val);
        }
        iterTree(node.left, dep+1);
        iterTree(node.right, dep+1);
    }
}
