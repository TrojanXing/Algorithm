package java.solution;

import java.util.Arrays;
import java.util.Comparator;

public class LC179_Largest_Number {
	public String largestNumber(int[] nums) {
        String[] ns = new String[nums.length];
        
        for(int i = 0; i < nums.length; i++) {
            ns[i] = String.valueOf(nums[i]);
        }
        
        Arrays.sort(ns, new Comparator<String>() {
             public int compare(String a, String b) {
                return (b + a).compareTo(a + b);
            }
        });
        StringBuilder sb = new StringBuilder();
        if(ns[0].equals("0")) return "0";
        for(String n : ns) {
            sb.append(n);
        }
        return sb.toString();
    }
}
