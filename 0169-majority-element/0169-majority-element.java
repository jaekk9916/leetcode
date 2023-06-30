class Solution {
    public int majorityElement(int[] nums) {
        int majority = 0;
        int cnt = 0;
        
        for(int i : nums){
            if(cnt == 0){
                majority = i;
            }
            
           cnt += (majority == i) ? 1 : -1;
        }
        
        return majority;
    }
}