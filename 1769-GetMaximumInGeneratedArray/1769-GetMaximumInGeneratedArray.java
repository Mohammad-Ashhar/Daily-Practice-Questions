// Last updated: 31/07/2025, 21:11:07
class Solution {
    public int getMaximumGenerated(int n) {
        int ans=0;
        int nums[]=new int[n+1];
        int i=1;
        if(n==0)
        return 0;
        if(n==1)
        return 1;
        nums[0]=0;
        nums[1]=1;
        while((n-1)>0)
        {
            nums[2 * i] = nums[i];
            n--;
            if(n-1>0)
            {
                nums[2 * i + 1] = nums[i] + nums[i + 1];
            }
            i++;
            n--;
        }
        int max=-1;
        for (int a=0; a<nums.length; a++ )
        {
            max=Math.max(max,nums[a]);
        }
        return max;
    }
}