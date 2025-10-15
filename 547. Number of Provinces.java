class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        boolean[] visited=new boolean[n];
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(!visited[i])
            {
                c++;
                fun(isConnected,visited,i);
            }
        }
        return c;
    }
    public void fun(int[][] isConnected,boolean[] visited,int start)
    {
        visited[start]=true;
        for(int i=0;i<isConnected.length;i++)
        {
            if(isConnected[start][i]==1 && !visited[i])
            {
                fun(isConnected,visited,i);
            }
        }
    }
}