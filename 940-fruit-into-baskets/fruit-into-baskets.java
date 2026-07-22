import java.util.HashMap;

class Solution {
    public int totalFruit(int[] fruits) {
        int l = 0, ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int r = 0; r < fruits.length; r++) {
            // Add current fruit to the window
            map.put(fruits[r], map.getOrDefault(fruits[r], 0) + 1);

            // Shrink the window until we have at most 2 fruit types
            while (map.size() > 2) {
                map.put(fruits[l], map.get(fruits[l]) - 1);
                if (map.get(fruits[l]) == 0) {
                    map.remove(fruits[l]);
                }
                l++; // Move left pointer forward!
            }

            // Update answer for valid windows (at most 2 distinct fruits)
            ans = Math.max(ans, r - l + 1);
        }

        return ans;
    }
}