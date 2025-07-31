// Last updated: 31/07/2025, 21:15:39
class Solution {
    public boolean judgeSquareSum(int c) {
        long l=0;
        long r=(long)Math.sqrt(c);
        while (l<=r)
        {
            long s=l*l+r*r;
            if (s==c)
            {
                return true;
            }
            else if(s<c)
            {
                l++;
            }
            else
            {
                r--;
            }
        }
        return false;
        
    }
}