package java.solution;

import java.util.Arrays;

public class LC416_Partition_Equal_Subset_Sum {
	public boolean canPartition(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        for(int i : nums){
            sum += i;
        }
        if(sum % 2 != 0) return false;
        sum >>= 1;
        boolean[] dp = new boolean[sum + 1]; 
        dp[0] = true;
        for(int n:nums) {
            if(n > sum) return false;
            if(n == sum) return true;
            for(int i = sum; i >= n; i--){
                dp[i] |= dp[i - n];
            }
        }
                
        return dp[sum];
	}
}
