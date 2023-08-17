class Solution {
    public int removeDuplicates(int[] nums) {
        int idx = 1;
        int cnt = 1;
        int compare = nums[0];
        
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == compare){
                if(cnt == 2) continue;
                nums[idx++] = nums[i];
                cnt++;
            } else {
                compare = nums[i];
                nums[idx++] = compare;
                cnt = 1;
            }
        }
        return idx;
    }
}