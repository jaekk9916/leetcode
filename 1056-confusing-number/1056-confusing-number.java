class Solution {
    public boolean confusingNumber(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();   
        map.put(0,0);
        map.put(1,1);
        map.put(6,9);
        map.put(8,8);
        map.put(9,6);
        
        int rotateNum = 0, nCopy = n;
        while(nCopy>0){
            if(!map.containsKey(nCopy%10)){
                return false;
            }    
            
            rotateNum = rotateNum*10 + map.get(nCopy%10);
            nCopy /= 10;
        }
        return n != rotateNum;
    }
}