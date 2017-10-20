package java.solution;

public class LC312_Burst_Ballons {
    public int maxCoins(int[] nums) {
        int len = nums.length;
        if(len == 0) {
            return 0;
        }
        int[][] dp = new int[len][len];
        for(int i = 0; i < len; i++){
            dp[i][i] = nums[i] * (i == 0 ? 1 : nums[i - 1]) * (i == len - 1 ? 1 : nums[i + 1]);
        }        
        for(int i = 1; i < len; i++){
            for(int r = 0; r < len - i; r++){
                int max = -1;
                int c = r + i;
                int edge = (r > 0 ? nums[r - 1] : 1) * (c < len-1 ? nums[c + 1] : 1); 
                for(int k = r; k <= c; k++){
                    max = Math.max(max, (k == r ? 0 : dp[r][k-1]) + (k == c ? 0 : dp[k+1][c]) + edge*nums[k]);
                }
                dp[r][c] = max;
            }
        }
        return dp[0][len-1];
    }
}
