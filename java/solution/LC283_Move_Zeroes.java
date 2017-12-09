package java.solution;

class Solution {
    public void moveZeroes(int[] nums) {
        int fast = 0, slow = 0;
        while(fast < nums.length) {
            while(fast < nums.length && nums[fast] == 0) fast++;
            if(fast == nums.length) break;
            int temp = nums[slow];
            nums[slow++] = nums[fast];
            nums[fast++] = temp;
        }
    }
}