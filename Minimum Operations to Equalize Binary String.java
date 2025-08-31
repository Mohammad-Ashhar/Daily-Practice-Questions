class Solution {
    public int minOperations(String s, int k) {
        int n = s.length();
        int zeros = 0;
        for (char c : s.toCharArray()) if (c == '0') zeros++;
        if (zeros == 0) return 0;
        if (k == n) {
            if (zeros == n) return 1;
            return -1;
        }
        int ones = n - zeros;
        for (int i = 1; i <= n; i++) {
            long flip = 1L * i * k;
            if (flip < zeros) continue;
            if ((flip & 1L) != (zeros & 1)) continue;
            long max = 1L * n * i - ((i % 2 == 0) ? zeros : ones);
            if (flip <= max) return i;
        }
        return -1;
    }
}
