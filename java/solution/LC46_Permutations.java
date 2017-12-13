class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new LinkedList();
        backtrack(list, new ArrayList<Integer>(), nums);
        return list;
    }
    private void backtrack(List<List<Integer>> list, ArrayList<Integer> temp, int[] nums) {
        if(temp.size() == nums.length) {
            list.add(new ArrayList<Integer>(temp));
            return;
        }
        for(int i = 0; i < nums.length; i++) {
            if(temp.contains(nums[i])) continue;
            temp.add(nums[i]);
            backtrack(list, temp, nums);
            temp.remove(temp.size() - 1);
        }
    }
}