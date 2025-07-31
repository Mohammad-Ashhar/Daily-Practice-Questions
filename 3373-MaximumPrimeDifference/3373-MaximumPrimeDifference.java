// Last updated: 31/07/2025, 21:05:22
class Solution {
    public int maximumPrimeDifference(int[] nums) {
        int first=-1,last=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(isPrime(nums[i]))
            {
                if(first==-1)
                {
                    first=i;
                }
                last=i;
            }
        }
        if(first==-1 || last==-1 || first==last)
        {
            return 0;
        }
        return last-first;
    }
    public static boolean isPrime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}