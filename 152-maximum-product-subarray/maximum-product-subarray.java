class Solution {
    public int maxProduct(int[] nums) {
        int prefix=1;
        int sufix=1;
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(prefix == 0) prefix = 1;
            if(sufix == 0) sufix=1;
            prefix *=nums[i];
            sufix *=nums[nums.length-1-i];
            ans = Math.max(ans,Math.max(prefix,sufix));
        }
        return ans;
    }
}