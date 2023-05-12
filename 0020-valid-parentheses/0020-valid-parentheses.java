class Solution {
    public boolean isValid(String s) {
        // Initialize has map with mappings
        // Use closing bracket as a key to ensure correct order
        Map map = new HashMap<Character, Character>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        
        // Use stack structure to check order
        Stack<Character> stack = new Stack<Character>();
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            
            if(map.containsKey(c)){
                // Returns false if the bracket closing order does not match
                if(stack.empty() || map.get(c) != stack.pop())
                    return false;
            } else {
                // If it was an opening bracket, push to the stack.
                stack.push(c);
            }
        }
        // Check if stack is empty in case only the opening bracket are stacked
        return stack.empty();
    }
}