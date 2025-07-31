// Last updated: 31/07/2025, 21:06:05
class Solution {
    public int countTestedDevices(int[] batteryPercentages) {
        int c=0;
        int i,j=0;
        for(i=0;i<batteryPercentages.length;i++)
        {   if (batteryPercentages[i]>0)
            {    c+=1;
                for( j=i+1;j<batteryPercentages.length;j++)
                {   if (batteryPercentages[j]<=0)
                    {
                        batteryPercentages[j]=0;
                    }
                    else
                    {
                        batteryPercentages[j]=batteryPercentages[j]-1;   
                    } 
                }
            } 
        }
    return c;
    }
}        