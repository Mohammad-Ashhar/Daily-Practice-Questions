// Last updated: 31/07/2025, 21:17:49
class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)
        {
            return nums[0];
        }
        int m1=Rob(nums,0,n-2);
        int m2=Rob(nums,1,n-1);
        return Math.max(m1,m2);
    }
    public static int Rob(int[] nums,int idx,int end)
    {
        int p=0,c=0;
        for(int i=idx;i<=end;i++)
        {
            int temp=c;
            c=Math.max(p+nums[i],c);
            p=temp;
        }
        return c;
    }
}