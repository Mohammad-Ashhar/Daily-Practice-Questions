// Last updated: 31/07/2025, 21:04:44
class Solution {
    public int minOperations(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length-2;i++)
        {
            if(nums[i]==0)
            {
                for(int j=i;j<i+3;j++)
                {
                    nums[j]=1-nums[j];
                }
                c+=1;
            }
        }
        if(allOne(nums))
        {
            return c;
        }
        return -1;
    }
    public static boolean allOne(int[] nums)
    {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                return false;
            }
        }
        return true;
    }
}