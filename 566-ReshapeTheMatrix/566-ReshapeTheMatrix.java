// Last updated: 31/07/2025, 21:15:49
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(r*c!=mat[0].length*mat.length)
        {
            return mat;
        }
        int [][] new_mat=new int[r][c];
        int row=0;
        int col=0;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
                if(col>c-1)
                {
                    row=row+1;
                    col=0;
                }
                new_mat[row][col]=mat[i][j];
                col+=1;
            }
        }
        return new_mat;
        
        
    }
}