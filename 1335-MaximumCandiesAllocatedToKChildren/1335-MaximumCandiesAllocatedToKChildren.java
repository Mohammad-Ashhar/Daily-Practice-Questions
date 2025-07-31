// Last updated: 31/07/2025, 21:13:19
class Solution {
    public int maximumCandies(int[] candies, long k) {
        long maxc=0;
        for(int c:candies)
        {
            maxc=Math.max(maxc,c);
        }
        long low=1,high=maxc,res=0;
        while(low<=high)
        {
            long mid=low+(high-low)/2;
            long count=0;
            for(int c:candies)
            {
                count+=c/mid;
                if(count>=k)
                {
                    break;
                }
            }
            if(count>=k)
            {
                res=mid;
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return (int)res;
        
    }
}