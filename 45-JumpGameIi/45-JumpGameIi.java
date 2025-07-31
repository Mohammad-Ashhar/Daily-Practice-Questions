// Last updated: 31/07/2025, 21:19:26
class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        if(n<=1)
        {
            return 0;
        }
        int jumps=0,curr=0,farthest=0;
        for(int i=0;i<=n-2;i++)
        {
            farthest=Math.max(farthest,i+nums[i]);
            if(i==curr)
            {
                jumps+=1;
                curr=farthest;
                if(curr>=n-1)
                {
                    break;
                }
            }
        }
        return jumps;
        
    }
}