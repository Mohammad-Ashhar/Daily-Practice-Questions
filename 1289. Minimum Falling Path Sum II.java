class Solution {
    public int minFallingPathSum(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        int[][] dp = new int[n][m];
        for (int[] a : dp) Arrays.fill(a, -66666);
        int ans = Integer.MAX_VALUE;
        for (int col = 0; col < m; col++) {
            ans = Math.min(ans, Minimum_Falling_Path(grid, 0, col, dp));
        }
        return ans;
    }

    public static int Minimum_Falling_Path(int[][] matrix, int cr, int cc, int[][] dp) {
        if (cc < 0 || cc >= matrix[0].length) return Integer.MAX_VALUE;
        if (cr == matrix.length - 1) return matrix[cr][cc];
        if (dp[cr][cc] != -66666) return dp[cr][cc];

        int best = Integer.MAX_VALUE;
        for (int i = 0; i < matrix[0].length; i++) {
            if (i == cc) continue;
            best = Math.min(best, Minimum_Falling_Path(matrix, cr + 1, i, dp));
        }
        return dp[cr][cc] = best + matrix[cr][cc];
    }
}
