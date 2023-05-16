class Solution {
    public String stringShift(String s, int[][] shift) {
        
        int len = s.length();
        for(int[] element : shift){
            int direction = element[0] == 0 ? 0 : 1;
            int amount = element[1] % s.length();
            
            if(direction == 0){
                s = s.substring(amount) + s.substring(0, amount);
            } else {
                s = s.substring(len - amount) + s.substring(0, len - amount);
            }
        }
        return s;
    }
}