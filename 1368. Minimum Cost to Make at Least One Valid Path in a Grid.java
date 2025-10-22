class Solution {
    public static final int[]dr={0,0,1,-1}; 
    public static final int[]dc={1,-1,0,0};
    public static int dirIndex(int val) {
        if (val==1) return 0; // right
        if (val==2) return 1; // left
        if (val==3) return 2; // down
        return 3;               // up (val==4)
    }
    public int minCost(int[][] grid) {
        int m=grid.length,n=grid[0].length;
        int INF=Integer.MAX_VALUE;
        int[][] dist=new int[m][n];
        for (int i=0; i<m; ++i) Arrays.fill(dist[i],INF);
        dist[0][0]=0;
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b) -> Integer.compare(a[0],b[0]));
        pq.add(new int[]{0,0,0});
        while (!pq.isEmpty()) {
            int[] cur=pq.poll();
            int cost=cur[0],r=cur[1],c=cur[2];
            if (cost>dist[r][c]) continue; 
            if (r==m-1 && c==n-1) return cost; 
            int curDir=dirIndex(grid[r][c]);
            for (int k=0; k<4; ++k) {
                int nr=r +dr[k],nc=c +dc[k];
                if (nr<0 || nr>=m || nc<0 || nc>=n) continue;
                int add=(k==curDir)?0:1;
                int nd=cost + add;
                if (nd<dist[nr][nc]) {
                    dist[nr][nc]=nd;
                    pq.add(new int[]{nd,nr,nc});
                }
            }
        }
        return dist[m-1][n-1];
    }
}