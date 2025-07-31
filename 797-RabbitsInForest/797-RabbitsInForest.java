// Last updated: 31/07/2025, 21:15:04
class Solution {
    public int numRabbits(int[] answers) {
        int[] f=new int[1000];
        for(int e:answers)
        {
            f[e]++;
        }
        int ans=0;
        for(int i=0;i<f.length;i++)
        {
            int c=f[i];
            if(c==0) 
            {
                continue;
            }
            int grp=i+1;
            int gneed=(c+grp-1)/grp;
            ans+=gneed*grp;
        }
        return ans;
        
    }
}