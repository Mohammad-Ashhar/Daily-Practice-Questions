// Last updated: 31/07/2025, 21:19:22
class Solution {
    public void rotate(int[][] matrix) {
        int l=matrix.length;
        int[][] newmat=new int[l][l];
        for(int i=0;i<l;i++)
        {
            for(int j=0;j<l;j++)
            {
                newmat[j][l-i-1]=matrix[i][j];
            }
        }
        for(int i=0;i<l;i++)
        {
            for(int j=0;j<l;j++)
            {
                matrix[i][j]=newmat[i][j];
            }
        }
        
    }
}