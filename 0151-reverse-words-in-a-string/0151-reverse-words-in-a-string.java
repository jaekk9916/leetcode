class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        Stack stack = new Stack();
        StringBuilder builder = new StringBuilder();
        Boolean isLastCharSpace = false;
        
        s = s.trim();
        
        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) != ' '){
                stack.push(s.charAt(i));
            } else {
                if(stack.isEmpty()){
                    continue;
                } else {
                    while(!stack.isEmpty()){
                        builder.append(stack.pop());
                    }
                    builder.append(' ');
                }
                
            }
             
        }
        
        while(!stack.isEmpty()){
                        builder.append(stack.pop());
                    }
        return builder.toString();
    }
}
