class Solution {
    public boolean isValid(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            int len = sb.length();
            
            if( len > 0) {
                char last = sb.charAt(len-1);
                if(last == '{' && c=='}' || last == '(' && c==')' || last == '[' && c==']'){ 
                sb.deleteCharAt(len-1);
                continue;
                }
            }
            sb.append(c);
        }
        boolean result = (sb.length() > 0) ? false : true;

        return result;

        
        
    }
}