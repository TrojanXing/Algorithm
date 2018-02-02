class Solution {
    private int[] original;
    private Random random;
    public Solution(int[] nums) {
        original = nums;
        random = new Random();
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return original;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int[] res = original.clone();
        for(int i = 1; i < res.length; i++) {
            int j = random.nextInt(i + 1);
            swap(res, i, j);
        }
        return res;
    }
    
    private void swap(int[] res, int i, int j) {
        int temp = res[i];
        res[i] = res[j];
        res[j] = temp;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */