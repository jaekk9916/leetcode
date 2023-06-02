class Solution {
    public List<List<Integer>> findMissingRanges(int[] nums, int lower, int upper) {
        List<List<Integer>> missingRanges = new ArrayList();
        int len = nums.length;
        
        if(len == 0){
            missingRanges.add(Arrays.asList(lower, upper));
            return missingRanges;
        }
        
        if(lower < nums[0]){
            missingRanges.add(Arrays.asList(lower, nums[0] - 1));
        }
        
        for(int i=0; i < len - 1; i++){
            if(nums[i + 1] - nums[i] > 1){
                missingRanges.add(Arrays.asList(nums[i] + 1, nums[i + 1] -1));
            }
        }
        
        if(upper > nums[len-1]){
            missingRanges.add(Arrays.asList(nums[len - 1] + 1, upper));
        }
        
        return missingRanges;
    }
}