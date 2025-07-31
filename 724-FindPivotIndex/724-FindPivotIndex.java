// Last updated: 31/07/2025, 21:15:21
class Solution {
    public int pivotIndex(int[] nums) {
        int rightsum=0,leftsum=0;
        for(int i:nums)
        {
            rightsum+=i;
        }
        for(int i=0;i<nums.length;i++)
        {
            rightsum-=nums[i];
            if(rightsum==leftsum)
            {
                return i;
            }
            leftsum+=nums[i];
        }
        return -1;
    }
}