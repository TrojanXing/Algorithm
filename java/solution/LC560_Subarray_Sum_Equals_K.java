package solution;

import java.util.HashMap;

public class LC560_Subarray_Sum_Equals_K {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int sum = 0;
        int res = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(sum == k) res++;
            if(map.containsKey(sum - k)) {
                res += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return res;
    }
}
