package java.solution;

import java.util.LinkedList;
import java.util.List;

public class LC229_Majority_Element_2 {
	public List<Integer> majorityElement(int[] nums) {
        int count1 = 0, count2 = 0;
        int maj1 = 0, maj2 = 1;
        List<Integer> list = new LinkedList<Integer>();
        for(int i:nums){
            if(i == maj1){
                count1++;
            } else if(i == maj2){
                count2++;
            } else if(count1 == 0){
                maj1 = i;
                count1 = 1;
            } else if(count2 == 0){
                maj2 = i;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for(int i:nums){
            if(i == maj1){
                count1++;
            }
            if(i == maj2){
                count2++;
            }
        }
        int flag = nums.length / 3;
        if(count1 > flag) list.add(maj1);
        if(count2 > flag) list.add(maj2);
        return list;
    }
}
