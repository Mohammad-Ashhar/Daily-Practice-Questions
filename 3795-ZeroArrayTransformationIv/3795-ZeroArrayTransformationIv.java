// Last updated: 31/07/2025, 21:04:09
class Solution {
    public int minZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] copy = Arrays.copyOf(nums, n);
        boolean Zero = true;
        for (int num : copy) {
            if (num != 0) {
                Zero = false;
                break;
            }
        }
        if (Zero) return 0;
        int low = 1;
        int high = queries.length;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canMakeZero(nums, queries, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
    public static boolean canMakeZero(int[] nums, int[][] queries, int k) {
        int n = nums.length;
        for (int j = 0; j < n; j++) {
            int tar = nums[j];
            if (tar == 0) continue;
            List<Integer> avail = new ArrayList<>();
            for (int i = 0; i < k; i++) {
                if (queries[i][0] <= j && j <= queries[i][1]) {
                    avail.add(queries[i][2]);
                }
            }
            if (!subsetSum(avail, tar)) {
                return false;
            }
        }
        return true;
    }
    public static boolean subsetSum(List<Integer> ll, int target) {
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;
        for (int v : ll) {
            for (int s = target; s >= v; s--) {
                if (dp[s - v]) {
                    dp[s] = true;
                }
            }
        }
        return dp[target];
        
    }
}