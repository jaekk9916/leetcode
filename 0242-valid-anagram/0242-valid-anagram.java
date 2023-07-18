class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> sMap = new HashMap<Character, Integer>();
        HashMap<Character, Integer> tMap = new HashMap<Character, Integer>();
        
        if(s.length() != t.length()) return false;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            sMap.put(c, sMap.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        }

        // return sMap.equals(tMap);
        for(int i = 0; i < s.length(); i++){
                               
            if(!sMap.get(s.charAt(i)).equals(tMap.get(s.charAt(i)))){
                return false;
            } 
        }
        return true;
  
    }
}