// Last updated: 31/07/2025, 21:04:32
class Solution {
    public int minZeroArray(int[] nums, int[][] queries) {
        int n=nums.length;
        int q=queries.length;
        int l=0,h=q+1;
        int ans=-1;
        while(l<h)
        {
            int mid=l+(h-l)/2;
            if(Zero(nums,queries,mid))
            {
                ans=mid;
                h=mid;
            }
            else
            {
                l=mid+1;
            }
        }
        return ans;
    }
    public static boolean Zero(int[] nums,int[][] queries,int k)
    {
        int n=nums.length;
        long[] d=new long[n+1];
        for(int i=0;i<k;i++)
        {
            int l=queries[i][0];
            int r=queries[i][1];
            int v=queries[i][2];
            d[l]+=v;
            if(r+1<n)
            {
                d[r+1]-=v;
            }
        }
        long c=0;
        for(int i=0;i<n;i++)
        {
            c+=d[i];
            if(c<nums[i])
            {
                return false;
            }
        }
        return true;
    }
}