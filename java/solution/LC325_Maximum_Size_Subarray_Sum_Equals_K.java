class solution {

	// sum equals k
	public static int maximumSubarray(int[] nums, int k) {
		int sum = 0;
		int max = -1;
		Map<Integer, Integer> map = new HashMap<>();
		map.put(0, -1);

		for(int i = 0; i < nums.length; i++) {
			sum += nums[i];
			if(map.containsKey(sum - k)) {
				max = Math.max(max, i - map.get(sum - k));
			}
			if(!map.containsKey(sum)) map.put(sum, i);
		}
		return max;
	}

	// sum less than k
	public static int maximumSubarray(int[] nums, int k) {
		int sum = 0;
		int max = -1;
		int left = 0, right = 0;

		while(right < nums.length) {
			sum += nums[right++];
			if(sum <= k) {
				max = Math.max(max, right - left);
			} else {
				//naive way
//				while(sum > k && left < right) {
//					sum -= nums[left++];
//				}
				//better way, because we do not need to consider smaller subarray
				sum -= nums[left];
			}
		}

		return max;
	}
}