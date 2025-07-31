// Last updated: 31/07/2025, 21:03:50
class Solution {
    public char processStr(String s, long k) {
        String dup = s;
        int n = dup.length();
        long[] arr = new long[n];
        final long MAX = (long)1e15 + 5;
        for (int i = 0; i < n; i++) {
            char c = dup.charAt(i);
            long prev = i > 0 ? arr[i - 1] : 0;
            if (c == '*') {
                arr[i] = Math.max(0, prev - 1);
            } else if (c == '#') {
                arr[i] = Math.min(prev * 2, MAX);
            } else if (c == '%') {
                arr[i] = prev;
            } else {
                arr[i] = Math.min(prev + 1, MAX);
            }
        }
        if (n == 0 || k < 0 || k >= arr[n - 1]) {
            return '.';
        }
        for (int i = n - 1; i >= 0; i--) {
            char c = dup.charAt(i);
            long prev = i > 0 ? arr[i - 1] : 0;
            if (c == '*') {
                
            } 
            else if (c == '#') {
                
                if (k >= prev) {
                    k -= prev;
                }
            } 
            else if (c == '%') {
                k = prev - 1 - k;
            } 
            else {
                if (k == prev) {
                    return c;
                }
            }
        }
        return '.';
    }
}
