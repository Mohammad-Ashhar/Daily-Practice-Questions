// Last updated: 31/07/2025, 21:08:51
class Solution {
    public int waysToSplitArray(int[] nums) {
        int c=0;
        long totalsum=0;
        for(int num:nums)
        {
            totalsum+=num;
        }
        long leftsum=0;
        long rightsum=0;
        for(int i=0;i<nums.length-1;i++)
        {
            leftsum+=nums[i];
            rightsum=totalsum-leftsum;
            if(leftsum>=rightsum)
            {
                c++;
            }
        }
        return c;
        
    }
}