class Solution {
    public int findTargetSumWays(int[] nums, int S) {
        int sum = 0;
        for(int i:nums) {
            sum += i;
        }
        if(sum < S || -1 * sum > S) return 0;
        int[][] dp = new int[nums.length + 1][sum * 2 + 1];
        dp[0][sum] = 1;
        for(int r = 0; r < nums.length; r++) {
            for(int c = 0; c <= sum * 2; c++) {
                if(dp[r][c] != 0) {
                    if(c >= nums[r]) dp[r+1][c-nums[r]] += dp[r][c];
                    if(c <= sum*2 - nums[r]) dp[r+1][c+nums[r]] += dp[r][c];
                }
            }
        }
        return dp[nums.length][sum + S];
    }
}