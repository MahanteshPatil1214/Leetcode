class Solution {
    public int minAddToMakeValid(String s) {
        Deque<Character> sb = new ArrayDeque<>();
        for(char c : s.toCharArray()){
            if(!sb.isEmpty()){
                char last = sb.peek();
                if(last == '(' && c == ')'){
                    sb.pop();
                    continue;
                }
            }
            sb.push(c);
        }
        return sb.size();
        
    }
}