/**
 * @param {number[]} nums
 * @return {number}
 */
var majorityElement = function(nums) {
    var res = nums[0];
    var count = 1;
    for(let i = 1; i < nums.length; i++){
        if(nums[i] == res){
            count++;
        } else if(count == 0){
            res = nums[i];
            count = 1;
        } else {
            count--;
        }
    }
    return res;
};
