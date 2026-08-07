class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int high=0;
        for(int p:piles){
            high=Math.max(high,p);
        }
        int ans =high;
        while(l<=high){
            int mid=l+((high-l)/2);
            if(canEat(piles,h,mid)){
                ans=mid;
                high=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
        
    }

    public boolean canEat(int[] piles,int h,int k){
        long hours =0;
        for(int p:piles){
            hours+=(p+k-1)/k;
        }
        return hours<=h;

    }
}