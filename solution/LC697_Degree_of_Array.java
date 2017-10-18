package solution;

import java.util.HashMap;

public class LC697_Degree_of_Array {
    public int findShortestSubArray(int[] nums) {
        int len = nums.length;
        if(len <= 1) return len;
        HashMap<Integer, Integer[]> fre = new HashMap<Integer, Integer[]>();
        int mf = 1;
        for(int i = 0; i < len; i++){
            if(!fre.containsKey(nums[i])){
                fre.put(nums[i], new Integer[]{1, i, i});
            } else {
                Integer[] fi = fre.get(nums[i]);
                fi[0]++;
                fi[2] = i;
                fre.put(nums[i], fi);
                mf = Math.max(mf, fi[0]);
            }
        }
        int res = Integer.MAX_VALUE;
        for(Integer[] val : fre.values()){
            if(val[0] == mf){
                res = Math.min(res, val[2] - val[1]);
            }
        }
        return res + 1;
    }
}