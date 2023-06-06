class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int differ = arr[1]- arr[0];
        
        for(int i=2;i<arr.length;++i){
            if(differ != arr[i] - arr[i - 1]){
                return false;
            }
        }
        return true;
    }
}