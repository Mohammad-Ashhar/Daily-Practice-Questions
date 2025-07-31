// Last updated: 31/07/2025, 21:11:50
class Solution {
    public int minDifference(int[] nums) {
        Arrays.sort(nums);
        if(nums.length>4)
        {
            int n=nums.length;
            int m=Math.min(nums[n-1]-nums[3],nums[n-2]-nums[2]);
            int ma=Math.min(nums[n-3]-nums[1],nums[n-4]-nums[0]);
            return Math.min(m,ma);
        }
        else
        {
            return 0;
        }
        
    }
}