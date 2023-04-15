class Solution {
    public boolean isPalindrome(int x) {
        String str1 = Integer.toString(x);
        char[] arrStr1 = str1.toCharArray();
        char[] arrStr2 = new char[str1.length()];
        
        for(int i=0;i<str1.length();i++){
            arrStr2[i] = arrStr1[str1.length() - 1 - i];
        }

        for(int i=0;i<arrStr1.length;i++){
            if(arrStr1[i] != arrStr2[i]){
                return false;
            }
        }
        return true;
    }
}
