// Last updated: 31/07/2025, 21:05:01
class Solution {
    public boolean isArraySpecial(int[] nums) {
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]%2==nums[i+1]%2)
            {
                return false;
            }
        }
        return true;
    }
}