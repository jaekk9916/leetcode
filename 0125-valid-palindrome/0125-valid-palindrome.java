class Solution {
    public boolean isPalindrome(String s) {
        int head = 0;
        int tail = s.length() - 1;
        s = s.toLowerCase();
        
        while(head < tail){
            if(!Character.isLetterOrDigit(s.charAt(head))){
                head++;    
            } else if(!Character.isLetterOrDigit(s.charAt(tail))){
                tail--;    
            } else if(s.charAt(head) != s.charAt(tail)){
                return false;
            } else {
                head++;
                tail--;
            }
        }
        return true;
    }
}