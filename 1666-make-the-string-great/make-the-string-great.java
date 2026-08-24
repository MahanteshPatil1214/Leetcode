class Solution {
    public String makeGood(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            int len = sb.length();

            if(len > 0 && Character.toLowerCase(sb.charAt(len-1)) == Character.toLowerCase(c) && sb.charAt(len-1) != c) {
                sb.deleteCharAt(len-1);
            }
            else{
                sb.append(c);
            }
        }
        return sb.toString();
        
    }
}