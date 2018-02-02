
class solution {
	public static int maximumSubarray(int[] nums, int k) {
		int max = 0;
		int[] sum = new int[nums.length];
		sum[0] = nums[0];

		for(int i = 1; i < nums.length; i++) {
			sum[i] = sum[i-1] + nums[i];
		}

		for(int i = 0; i < nums.length; i++) {
			for(int j = i-1; j >= 0 && j >= i - k; j--) {
				max = Math.max(max, sum[i] - sum[j]);
			}
		}
		return max;
	}	
}
