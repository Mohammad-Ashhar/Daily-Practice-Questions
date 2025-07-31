// Last updated: 31/07/2025, 21:11:49
class Solution {
    public int numSubseq(int[] nums, int target) {
        final int MOD = 1_000_000_007;
        int n = nums.length;
        Arrays.sort(nums);
        int[] pow = new int[n];
        pow[0] = 1;
        for (int i = 1; i < n; i++) {
            pow[i] = (int)((pow[i - 1] * 2L) % MOD);
        }
        long ans = 0;
        int i = 0, j = n - 1;
        while (i <= j) {
            if (nums[i] + nums[j] <= target) {
                ans = (ans + pow[j - i]) % MOD;
                i++;
            } else {
                j--;
            }
        }
        return (int) ans;
    }
}
