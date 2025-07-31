// Last updated: 31/07/2025, 21:14:37
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1,high=Integer.MIN_VALUE;
        for(int p:piles)
        {
            high=Math.max(high,p);
        }
        int ans=0;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(canEat(piles,h,mid))
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
    public static boolean canEat(int[] piles,int hour,int k)
    {
        long sum=0;
        for(int p:piles)
        {
            sum+=(p/k)+(p%k!=0?1:0);
        }
        return sum<=hour;
    }
}