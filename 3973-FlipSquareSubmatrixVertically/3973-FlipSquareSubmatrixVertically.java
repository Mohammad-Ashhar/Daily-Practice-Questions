// Last updated: 13/08/2025, 11:53:05
class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int m = grid.length, n = grid[0].length;
        if (k <= 1) 
            return grid;
        for (int i = 0; i < k / 2; i++) {
            int toprow = x + i;
            int bottomrow = x + k - 1 - i;
            for (int j = 0; j < k; j++) {
                int col = y + j;
                int temp = grid[toprow][col];
                grid[toprow][col] = grid[bottomrow][col];
                grid[bottomrow][col] = temp;
            }
        }
        return grid;
        
    }
}