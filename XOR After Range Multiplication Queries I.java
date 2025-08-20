class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        final int MOD = 1_000_000_007;
        int q = queries.length;
        for (int i = 0; i < q; i++) {
            int l = queries[i][0];
            int r = queries[i][1];
            int k = queries[i][2];
            int v = queries[i][3];
            for (int idx = l; idx <= r; idx += k) {
                long p = nums[idx] * 1L * v;
                nums[idx] = (int) Math.floorMod(p, MOD);
            }
        }
        int ans = 0;
        for (int x : nums) ans ^= x;
        return ans;
    }
}