// Last updated: 31/07/2025, 21:07:34
class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int pos[][]=new int[m*n+1][2];
        for(int i=0;i<m;i++) 
        {
            for(int j=0;j<n;j++)
            {
                int val=mat[i][j];
                pos[val][0]=i;
                pos[val][1]=j;
            }
        }
        int[] row=new int[m];
        int[] col=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            int val=arr[i];
            int r=pos[val][0];
            int c=pos[val][1];
            row[r]++;
            col[c]++;
            if(row[r]==n||col[c]==m)
            {
                return i;
            }
        }
        return -1;      
    }
}