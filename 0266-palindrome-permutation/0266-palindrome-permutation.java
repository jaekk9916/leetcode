class Solution {
    public boolean canPermutePalindrome(String s) {
        int cnt = 0;
        int find = 0;
        
        for(char i = 0; i < 128 && cnt <= 1; i++){
            find = 0;
            for(int j = 0; j < s.length(); j++){
                if(s.charAt(j) == i)
                    find++;
            }
            cnt += find % 2;
        }
        
        return cnt <= 1;
    }
}