class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for(int s = 1; s <= Math.sqrt(n); s++) {
            dp[s*s] = 1;
        }
        for(int i = 1; i <= n; i++) {
            if(dp[i] == 1) continue;
            for(int j = 1; j < Math.sqrt(i); j++) {
                dp[i] = Math.min(dp[i], dp[i-j*j]+1);
            }
        }
        return dp[n];
    }
}