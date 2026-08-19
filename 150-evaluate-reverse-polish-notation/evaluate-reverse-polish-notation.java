class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        for(String t : tokens){
            if(t.equals("+") || t.equals("-")|| t.equals("*")||t.equals("/")){
                int a = stack.pop();
                int b = stack.pop();
            
            if(t.equals("+")) stack.push(b+a);
            else if (t.equals("-")) stack.push(b-a);
            else if(t.equals("*")) stack.push(a*b);
            else stack.push(b/a);
            }else{

            stack.push(Integer.parseInt(t));
            }
        }
        return stack.peek();
        
    }
}