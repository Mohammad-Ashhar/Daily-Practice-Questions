class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int n=queries.length;
        int[] ans=new int[n];
        int i=0;
        for(int[] q:queries)
        {
            int c=0;
            for(int[] p:points)
            {
                if((p[0]-q[0])*(p[0]-q[0])+(p[1]-q[1])*(p[1]-q[1])<=q[2]*q[2]) c++;
            }
            ans[i++]=c;
        }
        return ans;
        
    }
}