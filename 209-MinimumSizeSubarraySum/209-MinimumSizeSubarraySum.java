// Last updated: 31/07/2025, 21:17:52
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=nums.length;
        int min=Integer.MAX_VALUE;
        int left=0,sum=0;
        for(int right=0;right<l;right++)
        {
            sum+=nums[right];
            while(sum>=target)
            {
                min=Math.min(min,right-left+1);
                sum-=nums[left];
                left++;
            }
        }
        return (min==Integer.MAX_VALUE)?0:min;
        
    }
}