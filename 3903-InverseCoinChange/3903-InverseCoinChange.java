// Last updated: 31/07/2025, 21:03:55
class Solution {
    public List<Integer> findCoins(int[] numWays) {
        int n = numWays.length;
        long[] dp = new long[n + 1];
        dp[0] = 1;
        List<Integer> denomination = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            long ihave = dp[i];
            long iwant = numWays[i - 1];
            if (ihave > iwant) {
                return Collections.emptyList();
            }
            if (ihave < iwant) {
                if (iwant - ihave != 1) {
                    return Collections.emptyList();
                }
                denomination.add(i);
                for (int a = i; a <= n; a++) {
                    dp[a] += dp[a - i];
                }
            }
        }
        return denomination;
    }
}