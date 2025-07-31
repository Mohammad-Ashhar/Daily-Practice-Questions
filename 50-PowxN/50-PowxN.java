// Last updated: 31/07/2025, 21:19:19
class Solution {
    public double myPow(double x, int n) {
        long N=n;
        if(N<0)
        {
            x=1 / x;
            N=-N;
        }
        double result=1.0;
        while(N>0)
        {
            if((N & 1)==1)
            {
                result *= x;
            }
            x *= x;
            N >>= 1;
        }
        return result;
        
    }
}