// Last updated: 31/07/2025, 21:07:48
class Solution {
    public int captureForts(int[] forts) {
        int p=-2,x=0,m=0;
        for(int i=0;i<forts.length;i++)
        {
            if(forts[i]==1 || forts[i]==-1)
            {
                if(p==-2)
                {
                    p=forts[i];
                    x=i;
                }
                else if(p!=forts[i])
                {
                    m=Math.max(m,i-x-1);
                    p=forts[i];
                    x=i;
                }
                else
                {
                    x=i;
                }
            }
        }
        return m;
    }
}