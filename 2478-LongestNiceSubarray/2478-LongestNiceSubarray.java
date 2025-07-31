// Last updated: 31/07/2025, 21:08:21
class Solution {
    public int longestNiceSubarray(int[] nums) {
        int max=0,left=0,mask=0;
        for(int i=0;i<nums.length;i++)
        {
            while((mask & nums[i])!=0)
            {
                mask &= ~nums[left];
                left++;
            }
            mask |= nums[i];
            max=Math.max(max,i-left+1);
        }
        return max;
        
    }
}