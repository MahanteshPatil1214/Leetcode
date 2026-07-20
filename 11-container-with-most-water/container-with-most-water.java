class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int l=0,r=n-1,maxarea=0;
        while(l<r){
            int h = Math.min(height[l],height[r]);
            int w=r-l;
            int area=w*h;
            maxarea=Math.max(maxarea,area);
            if(height[l]<= height[r]){
                l++;
            }else{
                r--;
            }
        }
        return maxarea;
    }
}