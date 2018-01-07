class LC689_Maximum_Sum_of_3_Non-Overlapping_Subarrays {
    public int[] maxSumOfThreeSubarrays(int[] nums, int k) {
        int l = nums.length - k + 1;
        int[] subarr = new int[l];
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += nums[i];
        }

        for(int i = 0; i < subarr.length; i++) {
            subarr[i] = sum;
            sum -= nums[i];
            if(i + k < nums.length) sum += nums[i + k];
        }

        int[][] dp1 = new int[subarr.length][2];
        int[][] dp2 = new int[subarr.length][3];
        int[][] dp3 = new int[subarr.length][4];
        dp1[0][0] = subarr[0];
        dp2[0][0] = subarr[0];
        dp3[0][0] = subarr[0];

        for(int i = 1; i < subarr.length; i++) {
            if(subarr[i] > dp1[i-1][0]) {
                dp1[i][0] = subarr[i];
                dp1[i][1] = i;
            } else {
                dp1[i] = dp1[i-1];
            }
            if(i >= k) {
                if(dp1[i-k][0] + subarr[i] > dp2[i-1][0]) {
                    dp2[i][0] = dp1[i-k][0] + subarr[i];
                    dp2[i][1] = dp1[i-k][1];
                    dp2[i][2] = i;
                } else {
                    dp2[i] = dp2[i-1];
                }

                if(dp2[i-k][0] + subarr[i] > dp3[i-1][0]) {
                    dp3[i][0] = dp2[i-k][0] + subarr[i];
                    dp3[i][1] = dp2[i-k][1];
                    dp3[i][2] = dp2[i-k][2];
                    dp3[i][3] = i;
                } else {
                    dp3[i] = dp3[i-1];
                }
            } else {
                dp2[i][0] = dp1[i][0];
                dp2[i][1] = dp1[i][1];
                dp3[i][0] = dp2[i][0];
                dp3[i][1] = dp2[i][1];
            }
        }
        return new int[]{dp3[l-1][1], dp3[l-1][2], dp3[l-1][3]};
    }
}