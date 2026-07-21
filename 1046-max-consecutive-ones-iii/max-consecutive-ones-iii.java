class Solution {
    public int longestOnes(int[] nums, int k) {
        int left =0,zerocount=0;
        int maxans = 0;
        for (int right=0;right<nums.length;right++){
            if(nums[right]==0){
                zerocount++;
            }
            while(zerocount >k){
                if(nums[left] == 0){
                    zerocount--;
                }
                left++;
            }
            maxans=Math.max(maxans,right-left+1);
        }
        
        return maxans;
    }
    
}