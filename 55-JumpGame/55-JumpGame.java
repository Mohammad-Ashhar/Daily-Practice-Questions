// Last updated: 31/07/2025, 21:19:14
class Solution {
    public boolean canJump(int[] nums) {
        int maxtoreach=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i>maxtoreach)
            {
                return false;
            }
            maxtoreach=Math.max(maxtoreach,i+nums[i]);
            if(maxtoreach>=nums.length-1)
            {
                return true;
            }
        }
        return maxtoreach>=nums.length-1;
        
    }
}