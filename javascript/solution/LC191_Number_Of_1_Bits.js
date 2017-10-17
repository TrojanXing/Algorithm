/**
 * @param {number} n - a positive integer
 * @return {number}
 */
var hammingWeight = function(n) {
    var reg = /[1]/g;
    var res = n.toString(2).match(reg);
    return res === null? 0 : res.length;
};
