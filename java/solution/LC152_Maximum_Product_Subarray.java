package java.solution;

public class LC152_Maximum_Product_Subarray {
    public static int maxProduct(int[] nums) {
        int res = nums[0];
        int max = res;
        int min = res;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] < 0){
                int temp = min;
                min = max;
                max = temp;
            }

            max = Math.max(max * nums[i], nums[i]);
            min = Math.min(min * nums[i], nums[i]);

            res = Math.max(res, max);
        }
        return res;
    }
}
