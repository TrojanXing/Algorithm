package java.solution;

import java.util.Arrays;

public class LC646_Maximum_Length_of_Pair_Chain {
	public int findLongestChain(int[][] pairs) {
        /* dp solution */
        // int n = pairs.length;
        // int[] dp = new int[n];
        // Arrays.sort(pairs, (a, b) -> (a[0] - b[0]));
        // Arrays.fill(dp, 1);
        // for(int i = 1; i < n; i++) {
        //     for(int j = 0; j < i; j++) {
        //         if(pairs[i][0] > pairs[j][1]) {
        //             dp[i] = Math.max(dp[i], dp[j] + 1);
        //         }
        //     }
        // }
        // return dp[n-1];
        
        /* greedy solution */
        int n = pairs.length;
        int res = 0;
        Arrays.sort(pairs, (a, b) -> (a[1] - b[1]));
        int curEnd = 0;
        for(int i = 0; i < n; i++) {
            res++;
            curEnd = pairs[i][1];
            while(i < n-1 && pairs[i+1][0] <= curEnd) i++;
        }
        return res;
    }
}
