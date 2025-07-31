// Last updated: 31/07/2025, 21:16:18
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int gp=0,sp=0;
        int n=g.length,m=s.length;
        int cookie=0;
        while(gp<n && sp<m)
        {
            if(g[gp]<=s[sp])
            {
                cookie++;
                gp++;
                sp++;
            }
            else
            {
                sp++;
            }
        }
        return cookie;
    }
}