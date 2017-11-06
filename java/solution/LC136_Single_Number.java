package java.solution;

public class LC136_Single_Number {
	public int singleNumber(int[] nums) {
        int res = 0;
        for(int i : nums) {
            res ^= i;
        }
        return res;
    }
}
