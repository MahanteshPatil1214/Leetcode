class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer> numbers = new ArrayList<>(map.keySet());
        numbers.sort((a,b) ->
        map.get(b)- map.get(a));

        int[] result = new int[k];
        for(int i=0;i<k;i++){
            result[i]=numbers.get(i);
        }

        return result;
    }
}