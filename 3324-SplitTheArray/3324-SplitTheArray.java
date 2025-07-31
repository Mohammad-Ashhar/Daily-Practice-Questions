// Last updated: 31/07/2025, 21:05:36
class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length-1;i++)
        {
            c=0;
            for(int j=0;j<nums.length;j++)
            {
               if(nums[i]==nums[j])
               {
                c++;
               }
            }
            if(c>2)
            {
                return false;
            }
            
    }
    return true;
    }
}