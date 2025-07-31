// Last updated: 31/07/2025, 21:04:03
class Solution {
    public String smallestPalindrome(String s, int k) {
         int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        int[] halfCounts = new int[26];
        String center = "";
        for (int i = 0; i < 26; i++) {
            halfCounts[i] = freq[i] / 2;
            if (freq[i] % 2 == 1 && center.equals("")) {
                center = String.valueOf((char)(i + 'a'));
            }
        }
        StringBuilder halfSorted = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < halfCounts[i]; j++) {
                halfSorted.append((char)(i + 'a'));
            }
        }
        String prelunthak = halfSorted.toString();
        
        int halfLen = prelunthak.length();
        long totalPermutations = computeWays(halfCounts, halfLen, k + 1);
        if (totalPermutations < k) {
            return "";
        }
        StringBuilder kthHalf = new StringBuilder();
        int remaining = halfLen;
        for (int pos = 0; pos < halfLen; pos++) {
            for (int i = 0; i < 26; i++) {
                if (halfCounts[i] > 0) {
                    halfCounts[i]--;
                    long ways = computeWays(halfCounts, remaining - 1, k + 1);
                    if (ways < k) {
                        k -= ways;
                        halfCounts[i]++;
                    } else {
                        kthHalf.append((char)(i + 'a'));
                        remaining--;
                        break;
                    }
                }
            }
        }
        StringBuilder result = new StringBuilder();
        result.append(kthHalf);
        result.append(center);
        result.append(new StringBuilder(kthHalf).reverse().toString());
        
        return result.toString();
    }
    private long binom(int n, int r, long cap) {
        if (r > n - r) {
            r = n - r;
        }
        long res = 1;
        for (int i = 1; i <= r; i++) {
            res = res * (n - i + 1) / i;
            if (res > cap) {
                return cap; 
            }
        }
        return res;
    }
    private long computeWays(int[] counts, int T, long cap) {
        long ways = 1;
        for (int i = 0; i < 26; i++) {
            int cnt = counts[i];
            if (cnt > 0) {
                long bin = binom(T, cnt, cap);
                ways *= bin;
                if (ways > cap) {
                    return cap;
                }
                T -= cnt;
            }
        }
        return ways;
    }
}