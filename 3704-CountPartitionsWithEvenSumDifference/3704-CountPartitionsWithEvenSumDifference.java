// Last updated: 31/07/2025, 21:04:29
class Solution {
    public int countPartitions(int[] nums) {
        int totalsum=0;
        int left=0;
        int right=0;
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            totalsum+=nums[i];
        }
        for(int i=0;i<nums.length-1;i++)
        {
            left+=nums[i];
            right=totalsum-left;
            if(left%2==right%2)
            {
                c++;
            }
        }
        return c;
        
    }
}