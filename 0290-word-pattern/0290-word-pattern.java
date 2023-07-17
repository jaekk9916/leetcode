class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> patternMap = new HashMap<Character, String>();
        
        String[] sList = s.split(" ");
        
        if(sList.length != pattern.length()) return false;
        
        for(int i = 0; i< pattern.length(); i++){
            char p = pattern.charAt(i);
            
            if(patternMap.containsKey(p)){
                if(!patternMap.get(p).equals(sList[i])) return false;
                else continue;
            } else {
                if(patternMap.containsValue(sList[i])) return false;
                else patternMap.put(p, sList[i]);
            }
        }
        return true;
    }
}