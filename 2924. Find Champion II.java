class Solution {
    public int findChampion(int n, int[][] edges) {
        int[] indegree=new int[n];
        for(int[] e:edges) indegree[e[1]]++;
        int ans=-1,zeroIndegree=0;
        for(int i=0;i<n;i++)
        {
            if(indegree[i]==0)
            {
                ans=i;
                zeroIndegree++;
                if(zeroIndegree>1) return -1;
            }
        }
        return ans;
        
    }
}