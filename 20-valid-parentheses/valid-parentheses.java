class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(char c : s.toCharArray()){
            
            
            if( !stack.isEmpty()) {
                char last = stack.peek();
                if(last == '{' && c=='}' || last == '(' && c==')' || last == '[' && c==']'){ 
                stack.pop();
                continue;
                }
            }
            stack.push(c);
        }
        

        return stack.isEmpty();

        
        
    }
}