package java.solution;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LC349_Intersection_of_Two_Arrays {
	public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<Integer>();
        List<Integer> list = new ArrayList<Integer>();
        for(int n : nums1) {
            set.add(n);
        }
        for(int n : nums2) {
            if(set.contains(n)) {
                list.add(n);
                set.remove(n);
            }
        }
        int[] res = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
