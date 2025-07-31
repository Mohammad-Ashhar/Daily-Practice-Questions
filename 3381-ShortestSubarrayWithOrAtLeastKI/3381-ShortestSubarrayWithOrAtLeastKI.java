// Last updated: 31/07/2025, 21:05:19
class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
       int n=nums.length;
       int minl=Integer.MAX_VALUE;
       for(int i=0;i<n;i++)
       {
        for(int j=i;j<n;j++)
        {
            int s=0;
            for(int l=i;l<=j;l++)
            {
                s|=nums[l];
            }
            if (s>=k)
            {
                minl=Math.min(minl,j+1-i);
            }
        }
       }
       if(minl==Integer.MAX_VALUE)
        {
            return -1;
        }
        return minl;
        
    }
}