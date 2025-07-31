// Last updated: 31/07/2025, 21:09:50
class Solution {
    public long gridGame(int[][] grid) {
        int n=grid[0].length;
        long[] row_0=new long[n];
        long[] row_1=new long[n];
        row_0[n-1]=grid[0][n-1];
        row_1[0]=grid[1][0];
        for(int i =n-2;i>-1;i--)
        {
            row_0[i]=row_0[i+1]+grid[0][i];
        }
        for(int i=1;i<n;i++)
        {
            row_1[i]=row_1[i-1]+grid[1][i];
        }
        long res=Long.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            long top = (i + 1 < n) ? row_0[i + 1] : 0;
            long bottom = (i - 1 >= 0) ? row_1[i - 1] : 0;
            long secPoints=Math.max(top,bottom);
            res=Math.min(res,secPoints);
        }
        return res;
        
    }
}