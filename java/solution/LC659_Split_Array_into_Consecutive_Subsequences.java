package java.solution;

import java.util.HashMap;
import java.util.Map;

public class LC659_Split_Array_into_Consecutive_Subsequences {
    public boolean isPossible(int[] nums) {
        Map<Integer, Integer> fre = new HashMap<Integer, Integer>();
        Map<Integer, Integer> end = new HashMap<Integer, Integer>();
        for(int i : nums) {
            fre.put(i, fre.getOrDefault(i, 0) + 1);
        }
        for(int i : nums) {
            if(fre.getOrDefault(i, 0) == 0) {
                continue;
            } else if(end.getOrDefault(i, 0) > 0){
                end.put(i, end.get(i) - 1);
                end.put(i + 1, end.getOrDefault(i + 1, 0) + 1);
            } else if(fre.getOrDefault(i+1, 0) > 0 && fre.getOrDefault(i+2, 0) > 0) {
                end.put(i + 3, end.getOrDefault(i+3, 0) + 1);
                fre.put(i + 1, fre.get(i+1) - 1);
                fre.put(i + 2, fre.get(i+2) - 1);
            } else {
                return false;
            }
            fre.put(i, fre.get(i) - 1);
        }
        return true;
    }
}