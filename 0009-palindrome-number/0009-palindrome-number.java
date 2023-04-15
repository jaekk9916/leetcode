class Solution {
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        char[] arrStr = str.toCharArray();
        
        for(int i=0;i<str.length();i++){
            if(arrStr[i] != arrStr[arrStr.length-1-i])
            return false;
        }
        
        return true;
    }
}
