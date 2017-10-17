/**
 * @param {number[]} nums
 * @return {number}
 */
var rob = function(nums) {
    if(nums.length == 0) return 0;
    var first = nums[0];
    var second = Math.max(nums[0], nums[1]);
    if(nums.length == 1) return first;
    if(nums.length == 2) return second;
    var temp;
    for(let i = 2; i < nums.length; i++){
        temp = nums[i] + first;
        if(temp > second){
            first = second;
            second = temp;
        } else {
            first = second;
            second = second;
        }

    }
    return second;
};
