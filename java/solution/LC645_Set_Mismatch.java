class Solution {
    public int[] findErrorNums(int[] nums) {
        // Set<Integer> set = new HashSet();
        // int rightSum = ((1 + nums.length) * nums.length) >> 1;
        // int sum = 0;
        // int missing = -1;
        // for(int i: nums){
        //     if(missing == -1 && !set.add(i)){
        //         missing = i;    
        //     } 
        //     sum += i;
        // }
        // return new int[]{missing, missing + (rightSum - sum)};
        int[] res = new int[2];
        for(int i = 0; i < nums.length; i++) {
            if(nums[Math.abs(nums[i]) - 1] < 0) res[0] = Math.abs(nums[i]);
            else nums[Math.abs(nums[i]) - 1] *= -1;
        }
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) res[1] = i + 1;
        }
        return res;
    }
}