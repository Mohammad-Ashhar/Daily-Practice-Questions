// Last updated: 31/07/2025, 21:06:12
class Solution {
        public long distributeCandies(int n, int limit) {
        long total = comb2((long) n + 2);
        long one = comb2((long) n - limit + 1);
        long two = comb2((long) n - 2L * limit);
        long three = comb2((long) n - 3L * limit - 1);
        return total - 3L * one + 3L * two - three;
    }
    public long comb2(long k) {
        if (k < 0) return 0;
        return (k * (k - 1)) / 2;
    }
}
