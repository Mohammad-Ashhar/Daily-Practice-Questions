// Last updated: 31/07/2025, 21:05:51
class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            if (nums[i]%2==0)
            {
                c+=1;
                if (c>=2)
                {
                    return true;
                }
        }
        
    }
    return false;
}
}