# Last updated: 31/07/2025, 21:19:08
class Solution:
    def climbStairs(self, n: int) -> int:
        r=0;
        sumf=0;
        while(n>=r):
            sumf=sumf+math.comb(n,r)
            n=n-1
            r=r+1
        return sumf