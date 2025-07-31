// Last updated: 31/07/2025, 21:07:38
class Solution {
    public long repairCars(int[] ranks, int cars) {
        long low = 1;
        int max = 0;
        for (int r : ranks) {
            max = Math.max(max, r);
        }
        long high = (long) max * cars * cars;
        long ans = high;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            if (canRepair(ranks, mid, cars)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
    public static boolean canRepair(int[] ranks, long time, int cars) {
        long total = 0;
        for (int r : ranks) {
            total += (long) Math.sqrt((double) time / r);
            if (total >= cars) return true;
        }
        return total >= cars;
        
    }
}