class Solution {
    public String minWindow(String s, String t) {
        Map<Character,Integer> tmap = new HashMap<>();
        for(char ch : t.toCharArray()){
            tmap.put(ch,tmap.getOrDefault(ch,0)+1);
        }
        int l= 0,count=t.length();
        int minlen=Integer.MAX_VALUE;
        String ans="";
        Map<Character,Integer> smap = new HashMap<>();
        for(int r=0;r<s.length();r++){
            char ch=s.charAt(r);
            smap.put(ch,smap.getOrDefault(ch,0)+1);
            if(tmap.containsKey(ch) &&  smap.get(ch)<=tmap.get(ch)){
                count--;
            }
            while(count==0){
                if(r-l+1 < minlen){
                    minlen=r-l+1;
                    ans=s.substring(l,r+1);
                }
                char leftChar = s.charAt(l);
                smap.put(leftChar,smap.get(leftChar)-1);
                if(tmap.containsKey(leftChar) && smap.get(leftChar) < tmap.get(leftChar)){
                    count++;
                }
                l++;
            }

        }
        return ans;
        
    }
}