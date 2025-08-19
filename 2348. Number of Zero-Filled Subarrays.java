class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans=0,c=0;
        for(int val:nums)
        {
            if(val==0)
            {
                c++;
            }
            else
            {
                ans+=c*(c+1)/2;
                c=0;
            }
        }
        ans+=c*(c+1)/2;
        return ans;
        
    }
}