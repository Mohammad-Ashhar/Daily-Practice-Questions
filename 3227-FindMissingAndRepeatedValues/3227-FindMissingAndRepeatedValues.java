// Last updated: 31/07/2025, 21:06:02
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int[] freq=new int[n*n + 1];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                freq[grid[i][j]]+=1;
            }
        }
        int[] arr=new int[2];
        for(int i=1;i<freq.length;i++)
        {
            if(freq[i]==0)
            {
                arr[1]=i;
            }
            if(freq[i]==2)
            {
                arr[0]=i;
            }
        }
        return arr;
    }
}