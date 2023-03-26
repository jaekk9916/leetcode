class Solution {
    public boolean validWordSquare(List<String> words) {
        int cols = words.size();
        for(int i=0;i<words.size();i++){

            String tmp = words.get(i);
         
            for(int j=0;j<tmp.length();j++){
                if(j >= words.size() || i >= words.get(j).length() || tmp.charAt(j) != words.get(j).charAt(i)){
                    return false;
                }
            }
        }
    return true;
    }
}