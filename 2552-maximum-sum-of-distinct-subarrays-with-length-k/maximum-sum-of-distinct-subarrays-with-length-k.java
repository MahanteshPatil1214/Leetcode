import java.util.HashMap;
import java.util.Map;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long maxSum = 0;
        long windowSum = 0;
        Map<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            // Add current element to window
            windowSum += nums[i];
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);

            // Remove element sliding out of window (left side)
            if (i >= k) {
                int outNum = nums[i - k];
                windowSum -= outNum;
                freq.put(outNum, freq.get(outNum) - 1);
                if (freq.get(outNum) == 0) {
                    freq.remove(outNum);
                }
            }

            // Update maxSum only when window size is k AND all elements are distinct
            if (i >= k - 1 && freq.size() == k) {
                maxSum = Math.max(maxSum, windowSum);
            }
        }

        return maxSum;
    }
}