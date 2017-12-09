class Solution {
    public void sortColors(int[] nums) {
        int left = 0, right = nums.length - 1;
        for(int i = 0; i <= right; i++) {
            while(nums[i] == 2 && i < right) {
                swap(nums, i, right--);
            }
            while(nums[i] == 0 && i > left) {
                swap(nums, i, left++);
            }
        }
    }
    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}