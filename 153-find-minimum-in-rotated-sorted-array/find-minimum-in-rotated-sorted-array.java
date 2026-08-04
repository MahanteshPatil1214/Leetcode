class Solution {
    public int findMin(int[] nums) {
        int l = 0, r = nums.length - 1;
        
        while (l < r) {
            int mid = l + (r - l) / 2;
            
            // Minimum lies in the right unsorted portion
            if (nums[mid] > nums[r]) {
                l = mid + 1;
            } 
            // Minimum is mid or lies in the left portion
            else {
                r = mid;
            }
        }
        
        return nums[l]; // Return the value, not the index
    }
}