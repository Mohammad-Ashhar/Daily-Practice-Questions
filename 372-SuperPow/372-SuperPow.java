// Last updated: 31/07/2025, 21:16:52
class Solution {
    public int superPow(int a, int[] b) {
        int len = b.length;

        int mod = 1337;
        int pow = 0;
        for(int i=0; i<len; i++){
            pow = (pow*10 + b[i]) % 1140;
        }

        if (pow == 0) {
            pow += 1140;
        }

        a %= mod;
        long ans = 1;
        while(pow > 0){
            if((pow & 1) != 0){
                ans = (ans % mod * a % mod) % mod;
            }

            a = (a % mod * a % mod) % mod;
            pow = pow >> 1;
        }

        return (int)ans;
    }
}