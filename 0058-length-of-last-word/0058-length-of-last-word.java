class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        boolean flag = false;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != ' ' && flag == false) {
                length++;
            } else if(s.charAt(i) == ' '){
                flag = true;
            } else if(s.charAt(i) != ' ' && flag == true){
                length = 1;
                flag = false;
            }
        }
        return length;
    }
}