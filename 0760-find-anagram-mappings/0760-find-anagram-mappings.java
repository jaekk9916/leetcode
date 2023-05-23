class Solution {
    public int[] anagramMappings(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int l = nums1.length;
        
        int[] array = new int[l];
        
        for(int i=0;i<l;i++){
            map.put(nums2[i], i);
        }
        
        for(int i=0;i<l;i++){
            array[i] = map.get(nums1[i]);
        }
        
        return array;
    }
}