// Last updated: 31/07/2025, 21:05:31
class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int s=0,c=0,t=0,su=0;
        for(int i=0;i<apple.length;i++)
        {
            s+=apple[i];
        }
        for(int i=0;i<capacity.length;i++)
        {
            for(int j=0;j<capacity.length-1;j++)
            {
                if(capacity[j]<capacity[j+1])
                {
                    t=capacity[j+1];
                    capacity[j+1]=capacity[j];
                    capacity[j]=t;
                }

            }
        }
        for(int k=0;k<capacity.length;k++)
        {
            c+=1;
            su+=capacity[k];
            if (su>=s)
            {
                return c;
            }
        }
    return c;       
    }
}