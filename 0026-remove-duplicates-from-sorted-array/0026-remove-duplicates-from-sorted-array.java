class Solution {
    public int removeDuplicates(int[] nums) {
        int compare = nums[0];
        int idx = 1;
        
        for(int i = 1 ; i < nums.length; i++){
            if(nums[i] != compare){
                nums[idx++] = nums[i];
                compare = nums[i];
            }
        }
        return idx;
    }
}