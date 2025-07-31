// Last updated: 31/07/2025, 21:04:24
class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n=grid.length;
        for(int i=0;i<n;i++)
        {
            sortD(grid,i,0,false);
        }
        for(int j=1;j<n;j++)
        {
            sortD(grid,0,j,true);
        }
        return grid;        
    }
    public static void sortD(int[][] grid,int row,int col,boolean asc)
    {
        List<Integer>ll=new ArrayList<>();
        int i=row,j=col;
        int n=grid.length;
        while(i<n && j<n)
        {
            ll.add(grid[i][j]);
            i++;
            j++;
        }
        if(asc)
        {
            Collections.sort(ll);
        }
        else
        {
            Collections.sort(ll,Collections.reverseOrder());
        }
        i=row;
        j=col;
        int idx=0;
        while(i<n && j<n)
        {
            grid[i][j]=ll.get(idx++);
            i++;
            j++;
        }
        
    }
}