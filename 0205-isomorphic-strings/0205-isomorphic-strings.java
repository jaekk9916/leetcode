class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> mappingMap = new HashMap<Character, Character>();
        
        for(int i = 0; i < s.length(); i++){
            char original = s.charAt(i);
            char replace = t.charAt(i);
            
            if(!mappingMap.containsKey(original)){
                if(mappingMap.containsValue(replace)) return false;
                mappingMap.put(original, replace);
            }
            
            if(mappingMap.get(original) != replace) return false;
        }
        return true;
    }
}