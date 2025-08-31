class Solution {
    public int getLeastFrequentDigit(int n) {
        int[] freq = new int[10];
        while (n > 0) {
            freq[n % 10]++;
            n /= 10;
        }
        int minFreq = Integer.MAX_VALUE;
        for (int d = 0; d <= 9; d++) {
            if (freq[d] > 0 && freq[d] < minFreq) {
                minFreq = freq[d];
            }
        }
        for (int d = 0; d <= 9; d++) {
            if (freq[d] == minFreq) return d;
        }
        return -1;
    }
}