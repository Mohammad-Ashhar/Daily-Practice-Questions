// Last updated: 31/07/2025, 21:18:26
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int l=gas.length;
        int total=0;
        for(int i=0;i<l;i++)
        {
            total +=gas[i]-cost[i];
        }
        if(total<0)
        {
            return -1;
        }
        int idx=0;
        int curr=0;
        for(int i=0;i<l;i++)
        {
            curr +=gas[i]-cost[i];
            if(curr<0)
            {
                curr=0;
                idx=i+1;
            }
        }
        return idx;
        
    }
}