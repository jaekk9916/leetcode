/**
 * @param {number[]} nums
 * @param {Function} fn
 * @param {number} init
 * @return {number}
 */
var reduce = function(nums, fn, init) {
    if(nums.length == 0) return init;
    
    let total = init;
    nums.forEach((el) => {
        total = fn(total, el);
    });
    return total;
};