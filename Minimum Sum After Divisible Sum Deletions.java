class Solution {
    public long minArraySum(int[] nums, int k) {
        long neg = Long.MIN_VALUE;
        long[] arr = new long[k];
        for (int i = 0; i < k; i++) arr[i] = neg;
        arr[0] = 0L;
        long s = 0L;
        long keep = 0L;
        for (int x : nums) {
            s += x;
            int r = (int)(s % k);
            if (arr[r] != neg) keep = Math.max(keep, s + arr[r]);
            long val = keep - s;
            if (val > arr[r]) arr[r] = val;
        }
        return s - keep;  
    }
}