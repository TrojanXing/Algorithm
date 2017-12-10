class Solution {
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> set = new HashSet<Integer>();
        return iterateTree(root, set, k);
    }
    private boolean iterateTree(TreeNode root, Set<Integer> set, int target) {
        if(root == null) return false;
        if(set.contains(target - root.val)) {
            return true;
        } else {
            set.add(root.val);
        }
        return iterateTree(root.left, set, target) || iterateTree(root.right, set, target);
    }
}