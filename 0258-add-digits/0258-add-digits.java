class Solution {
    public int addDigits(int num) {
        if(num == 0) return 0;
        
        int quotient = 0;
        int remainder = 0;
        
        while(num>=10){
            quotient = num / 10;
            remainder = num % 10;
            num = quotient + remainder;
        }
        return num;
    }
}