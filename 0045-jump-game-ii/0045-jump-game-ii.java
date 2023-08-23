class Solution {
    public int jump(int[] nums) {
        if (nums.length <= 1) return 0; // if the array has only one element, no jumps are needed

        int currentMax = 0;  // the maximum index that can be reached using current number of jumps
        int nextMax = 0;    // the maximum index that can be reached using next jump
        int jumps = 0;      // the number of jumps made so far
        
        for (int i = 0; i < nums.length; i++) {
            // if the current index exceeds the max index that can be reached using the current number of jumps
            if (i > currentMax) {
                jumps++;              // make another jump
                currentMax = nextMax; // update current max index to next max index
            }
            nextMax = Math.max(nextMax, i + nums[i]); // update the max index that can be reached using next jump
        }
        
        if (currentMax < nums.length - 1) return -1; // if the end is not reachable, return -1

        return jumps;
    }
}
