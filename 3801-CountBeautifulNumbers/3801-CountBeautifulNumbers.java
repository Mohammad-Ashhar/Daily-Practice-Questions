// Last updated: 31/07/2025, 21:04:07
class Solution {
    static Map<String, Long> m;
    public int beautifulNumbers(int l, int r) {
        int[] arr = new int[] {l, r};
        long countR = countUpTo(arr[1]);
        long countL = countUpTo(arr[0] - 1);
        return (int)(countR - countL);
    }
    public static long countUpTo(int n) {
        if(n < 1) return 0;
        char[] s = String.valueOf(n).toCharArray();
        int[] dig = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            dig[i] = s[i] - '0';
        }
        m = new HashMap<>();
        return dp(0, 1, 0, 0, 1, dig);
    }
    public static long dp(int pos, int tight, int started, int sum, long prod, int[] digits) {
        if (pos == digits.length) {
            if (started == 0) return 0;  
            return (sum > 0 && prod % sum == 0) ? 1 : 0;
        }
        String key = pos + "_" + tight + "_" + started + "_" + sum + "_" + prod;
        if (m.containsKey(key)) return m.get(key);
        
        long res = 0;
        int limit = (tight == 1) ? digits[pos] : 9;
        for (int d = 0; d <= limit; d++) {
            int ntight = (tight == 1 && d == limit) ? 1 : 0;
            int nstarted = started;
            int nsum = sum;
            long nprod = prod;
            
            if (started == 0) {
                if (d == 0) {
                    nstarted = 0;
                    nsum = 0;
                    nprod = 1;  
                } else {
                    nstarted = 1;
                    nsum = d;
                    nprod = d;
                }
            } else {
                nsum = sum + d;
                if (prod == 0 || d == 0) {
                    nprod = 0;
                } else {
                    nprod = prod * d;
                }
            }
            res += dp(pos + 1, ntight, nstarted, nsum, nprod, digits);
        }
        m.put(key, res);
        return res;
    }
}