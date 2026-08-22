class Solution {
    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }
    private String build(String str){
        Deque<Character> stack = new ArrayDeque<>();
        for(char c : str.toCharArray()){
            if(c == '#'){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else{
                stack.push(c);
            }
        }

        StringBuilder result = new StringBuilder();
        for(char c : stack){
            result.append(c);
        }
        return result.toString();
    }
}