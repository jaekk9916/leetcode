class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> rMap = new HashMap<Character, Integer>();
        HashMap<Character, Integer> mMap = new HashMap<Character, Integer>();
        
        for(int j = 0; j < magazine.length(); j++){
            char character = magazine.charAt(j);
            if(!mMap.containsKey(character)) mMap.put(character, 1);
            else {
            mMap.put(character, mMap.get(character) + 1);}
        }
        
        for(int i = 0; i < ransomNote.length(); i++){
            char character = ransomNote.charAt(i);
            if(!mMap.containsKey(character)){
                return false;
            } else {
               mMap.put(character, mMap.get(character) - 1); 
            }
            
            if(mMap.get(character) == 0){
                mMap.remove(character);
            }
        }
        
        return true;
    }
}