// Last updated: 31/07/2025, 21:19:02
class Solution {
    public int climbStairs(int n) {
        if(n==1)
        {
            return 1;
        }
        if(n==2)
        {
            return 2;
        }
        int p1=1,p2=2;
        for(int i=3;i<=n;i++)
        {
            int c=p1+p2;
            p1=p2;
            p2=c;
        }
        return p2;
        
    }
}