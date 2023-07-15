class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> mMap = new HashMap<Character, Integer>();
        
        for(char c : magazine.toCharArray()){
            int val = mMap.getOrDefault(c, 0);
            mMap.put(c, val + 1);
        }
        
        for(char c : ransomNote.toCharArray()){
            if(!mMap.containsKey(c) || mMap.get(c) == 0){
                return false;
            } 
            
            mMap.put(c, mMap.get(c) - 1);
        }
        return true;
    }
}