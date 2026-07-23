class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums,k)-atMost(nums,k-1);
    }
    private int atMost(int[] nums,int k){
        int count=0;
        int l=0;
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int i=0;i<nums.length;i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        while(map.size() >k){
            map.put(nums[l],map.get(nums[l])-1);
            if(map.get(nums[l]) ==0){
                map.remove(nums[l]);
            }
            l++;
        }
        count +=i-l+1;
        }
        return count;
    }
}