// Last updated: 31/07/2025, 21:03:53
class Solution {
    public long numOfSubsequences(String s) {
        int n = s.length();
        long[] pre_l = new long[n+1];
        long[] pre_lc = new long[n+1];
        long[] suf_t = new long[n+1];
        long[] suf_ct = new long[n+1];
        for (int i = 1; i <= n; i++) {
            char c = s.charAt(i-1);
            pre_l[i] = pre_l[i-1] + (c=='L' ? 1 : 0);
            if (c == 'C') {
                pre_lc[i] = pre_lc[i-1] + pre_l[i-1];
            } else {
                pre_lc[i] = pre_lc[i-1];
            }
        }
        for (int i = n-1; i >= 0; i--) {
            char c = s.charAt(i);
            suf_t[i] = suf_t[i+1] + (c=='T' ? 1 : 0);
            if (c == 'C') {
                suf_ct[i] = suf_ct[i+1] + suf_t[i+1];
            } else {
                suf_ct[i] = suf_ct[i+1];
            }
        }
        long b = 0, c1 = 0, c2 = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == 'L') {
                c1++;
            } else if (c == 'C') {
                c2 += c1;
            } else if (c == 'T') {
                b += c2;
            }
        }
        long be = 0;
        for (int p = 0; p <= n; p++) {
            be = Math.max(be, suf_ct[p]);
            be = Math.max(be, pre_l[p] * suf_t[p]);
            be = Math.max(be, pre_lc[p]);
        }
        
        return b + be;
    }
}