// Last updated: 31/07/2025, 21:10:12
class Solution {
    public int countGoodNumbers(long n) {
      long evenPositions = (n + 1) / 2;
        long oddPositions = n / 2;
        long countEven = modPow(5, evenPositions, MOD);
        long countOdd = modPow(4, oddPositions, MOD);
        long result = (countEven * countOdd) % MOD;
        return (int) result;  
    }
    static final long MOD = 1_000_000_007;

    long modPow(long base, long exp, long mod) {
        long result = 1;
        base %= mod;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp >>= 1;
        }
        return result;
    }
}