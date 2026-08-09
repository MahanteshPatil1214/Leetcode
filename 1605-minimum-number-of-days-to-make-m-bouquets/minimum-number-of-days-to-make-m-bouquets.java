class Solution {
    public int minDays(int[] bloomday, int m, int k) {
        int n =bloomday.length;
        if((long) m * k>n){
            return -1;
        }
        int low =Integer.MAX_VALUE,high=Integer.MIN_VALUE;

        for(int day : bloomday){
            low=Math.min(low,day);
            high=Math.max(high,day);
        }
        int ans = -1;

        // Binary Search on the minimum day
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canMake(bloomday, m, k, mid)) {
                ans = mid;         // Record potential answer
                high = mid - 1;    // Try to find a smaller valid day
            } else {
                low = mid + 1;     // Need more days to bloom
            }
        }

        return ans;
        
    }

    private boolean canMake(int[] bloomday,int m,int k,int day){
        int count=0,bouquets=0;
        for(int bloom: bloomday){
            if(bloom <=day){
                count++;
                if(count == k){
                    bouquets++;
                    count=0;
                }
            }
            else{
                count=0;
            }
        }
        return bouquets >=m;
    }
}