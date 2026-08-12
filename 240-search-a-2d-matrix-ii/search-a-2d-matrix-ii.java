class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        
        int m = matrix.length;
        int n = matrix[0].length;
        int row = 0;
        int col = n - 1; // Start at top-right corner
        
        while (row < m && col >= 0) {
            int current = matrix[row][col];
            if (current == target) {
                return true;
            } else if (current > target) {
                col--; // Move left
            } else {
                row++; // Move down
            }
        }
        
        return false;
    }
}