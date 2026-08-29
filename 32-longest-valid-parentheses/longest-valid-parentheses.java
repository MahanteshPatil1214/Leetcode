class Solution {
    public int longestValidParentheses(String s) {
        int l=0,r =0,max=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                l++;
            }
            else{
                r++;
            }
            if(l==r){
                    max=Math.max(max,2 * r);
            }
            if(r > l){
                    l=r=0;
            }
            

        }
         l=r=0;
       

        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i) == '('){
                l++;
            }
            else{
                r++;
            }
            if(l==r){
                    max=Math.max(max,2 * r);
            }
            if(l > r){
                    l=r=0;
            }
            
            
        }
        return max;
    } 
}