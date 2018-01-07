class LC474_Ones_and_Zeroes {
    public int findMaxForm(String[] strs, int m, int n) {
        int ns = strs.length;
        int[][] dp = new int[m + 1][n + 1];
        for(int s = 1; s <= ns; s++) {
            int[] count = count(strs[s-1]);
            for(int i = m; i >= count[0]; i--) {
                for(int j = n; j >= count[1]; j--) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - count[0]][j - count[1]] + 1);
                }
            }
        }
        return dp[m][n];
    }

    private int[] count(String s) {
        int[] counter = new int[2];
        for(char c: s.toCharArray()) {
            counter[c-'0']++;
        }
        return counter;
    }
}