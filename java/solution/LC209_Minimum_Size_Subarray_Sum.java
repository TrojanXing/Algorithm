class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int res = Integer.MAX_VALUE;
        int fast = 0, slow = 0;
        int sum = 0;
        while(fast < nums.length) {
            sum += nums[fast++];
            while(sum >= s) {
                res = Math.min(res, fast - slow);
                sum -= nums[slow++];
            }
        }
        return res = res == Integer.MAX_VALUE ? 0 : res;
    }
}