package java.solution;

public class LC53_Maximum_Subarray {
	public int maxSubArray(int[] nums) {
        int res = nums[0];
        int sum = 0;
        for(int i : nums) {
            sum += i;
            res = Math.max(res, sum);
            if(sum < 0) {
                sum = 0;
            } 
        }
        return res;
    }
}
