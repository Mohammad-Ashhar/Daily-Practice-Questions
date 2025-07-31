// Last updated: 31/07/2025, 21:04:06
import java.math.BigInteger;
import java.util.Arrays;

public class Solution {
    static final long MOD = 1_000_000_007;
    static int maxN = 1000; 
    static long[] fact, invFact;
    
    static {
        precomputeFactorials();
    }
    
    static void precomputeFactorials() {
        fact = new long[maxN + 1];
        invFact = new long[maxN + 1];
        fact[0] = 1;
        for (int i = 1; i <= maxN; i++) {
            fact[i] = (fact[i - 1] * i) % MOD;
        }
        invFact[maxN] = modInverse(fact[maxN], MOD);
        for (int i = maxN - 1; i >= 0; i--) {
            invFact[i] = (invFact[i + 1] * (i + 1)) % MOD;
        }
    }
    
    static long modInverse(long a, long mod) {
        return powmod(a, mod - 2, mod);
    }
    
    static long powmod(long a, long b, long mod) {
        long res = 1;
        a %= mod;
        while (b > 0) {
            if ((b & 1) == 1)
                res = (res * a) % mod;
            a = (a * a) % mod;
            b >>= 1;
        }
        return res;
    }
    
    static long nCr(int n, int r) {
        if (r < 0 || r > n)
            return 0;
        return (((fact[n] * invFact[r]) % MOD) * invFact[n - r]) % MOD;
    }
    
    static long countLength(int L, int b) {
        return nCr(b + L - 2, L);
    }
    
    long[][][] memo;
    
    long dpCount(int pos, int last, int tight, int[] digits, int n, int b) {
        if (pos == n)
            return 1;
        if (memo[pos][last][tight] != -1)
            return memo[pos][last][tight];
        long res = 0;
        int limit = (tight == 1 ? digits[pos] : b - 1);
        for (int d = last; d <= limit; d++) {
            int ntight = (tight == 1 && d == limit) ? 1 : 0;
            res = (res + dpCount(pos + 1, d, ntight, digits, n, b)) % MOD;
        }
        memo[pos][last][tight] = res;
        return res;
    }
    
    long countUpTo(BigInteger X, int b) {
        if (X.compareTo(BigInteger.ONE) < 0)
            return 0;
        String baseStr = X.toString(b);
        String chardeblux = baseStr;
        int n = chardeblux.length();
        int[] digits = new int[n];
        for (int i = 0; i < n; i++) {
            digits[i] = chardeblux.charAt(i) - '0';
        }
        long total = 0;
        for (int L = 1; L < n; L++) {
            long ways = countLength(L, b);
            total = (total + ways) % MOD;
        }
        memo = new long[n + 1][b + 1][2];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= b; j++) {
                Arrays.fill(memo[i][j], -1);
            }
        }
        long exact = dpCount(0, 1, 1, digits, n, b);
        total = (total + exact) % MOD;
        return total;
    }
    
    public int countNumbers(String l, String r, int b) {
        BigInteger L = new BigInteger(l);
        BigInteger R = new BigInteger(r);
        long rightCount = countUpTo(R, b);
        BigInteger Lminus = L.subtract(BigInteger.ONE);
        long leftCount = countUpTo(Lminus, b);
        long ans = (rightCount - leftCount + MOD) % MOD;
        return (int) ans;
    }
    
   
}
