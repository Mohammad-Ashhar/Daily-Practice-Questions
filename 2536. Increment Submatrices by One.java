class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        int[][] arr=new int[n][n+1];
        for(int[] q:queries)
        {
            int r1=q[0];
            int c1=q[1];
            int r2=q[2];
            int c2=q[3];
            for(int i=r1;i<=r2;i++)
            {
                arr[i][c1]++;
                arr[i][c2+1]--;
            }
        }
        int[][] ans=new int[n][n];
        for(int i=0;i<n;i++)
        {
            int curr=0;
            for(int j=0;j<n;j++)
            {
                curr+=arr[i][j];
                ans[i][j]=curr;
            }
        }
        return ans;
        
    }
}