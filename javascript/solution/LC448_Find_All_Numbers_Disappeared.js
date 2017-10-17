/**
 * @param {number[]} nums
 * @return {number[]}
 */
var findDisappearedNumbers = function(nums) {
    var res = [];
    var ind = nums[0] - 1;
    for(let i in nums) {
        let temp = nums[i] < 0 ? nums[i] * -1 - 1: nums[i] - 1;
        if(nums[temp] >= 0){
            nums[temp] *= -1;
        }
    }
    for(let i = 0; i < nums.length; i++){
        if(nums[i] > 0){
            res.push(i+1);
        }
    }
    return res;
};
