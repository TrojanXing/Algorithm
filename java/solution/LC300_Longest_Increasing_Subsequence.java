package java.solution;

import java.util.Arrays;

public class LC300_Longest_Increasing_Subsequence {
	/**
	 *  Solution 1 Runtime Complexity O(n2);
	 * @param nums
	 * @return
	 */
	public int lengthOfLIS(int[] nums) {
        int len = nums.length;
        if(len == 0) return 0;
        int[] dp = new int[len];
        Arrays.fill(dp, 1);
        int max = 1;
        for(int i = 1; i < nums.length; i++){
            for(int j = 0; j < i; j++){
                if(nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            max = Math.max(max, dp[i]);
        }
        return max;
    }
	
	/**
	 * Solution 2 Binary Search. Runtime complexity O(nlogn)
	 * @param nums
	 * @return
	 */
	
	public int lengthOfLIS2(int[] nums) {
        int[] tails = new int[nums.length];
        int size = 0;
        for(int n : nums){
            int l = 0, r = size;
            
            while(l != r) {
                int m = l + (r - l) / 2;
                if(tails[m] < n) {
                    l = m + 1;
                } else {
                    r = m;
                }
            }
            tails[l] = n;
            if(l == size) size++;
            
        }
        return size;
	}
}
