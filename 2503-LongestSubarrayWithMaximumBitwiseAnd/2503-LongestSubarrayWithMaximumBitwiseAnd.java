// Last updated: 31/07/2025, 21:08:11
class Solution {
    public int longestSubarray(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int num:nums)
        {
            max=Math.max(max,num);
        }
        int l=0,curr=0;
        for(int num:nums)
        {
            if(num==max)
            {
                curr++;
                l=Math.max(l,curr);
            }
            else
            {
                curr=0;
            }
        }
        return l;
        
    }
}