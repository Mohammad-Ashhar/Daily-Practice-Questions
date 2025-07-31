// Last updated: 31/07/2025, 21:17:17
class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                return nums[i];
            }
        }
        return 1;
        
    }
}