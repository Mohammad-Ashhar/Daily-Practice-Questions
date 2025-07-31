// Last updated: 31/07/2025, 21:07:32
class Solution {
    public int minCapability(int[] nums, int k) {
        int low=Integer.MAX_VALUE,high=Integer.MIN_VALUE;
        for(int num:nums)
        {
            low=Math.min(low,num);
            high=Math.max(high,num);
        }
        int ans=high;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(Rob(nums,k,mid))
            {
                ans=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return ans;        
    }
    public static boolean Rob(int[] nums,int k,int mid)
    {
        int c=0;
        for(int i=0;i<nums.length && c<k;i++)
        {
            if(nums[i]<=mid)
            {
                c++;
                i++;
            }
        }
        return c>=k;
    }
}