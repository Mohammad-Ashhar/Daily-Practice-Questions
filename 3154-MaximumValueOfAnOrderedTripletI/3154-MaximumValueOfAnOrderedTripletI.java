// Last updated: 31/07/2025, 21:06:26
class Solution {
    public long maximumTripletValue(int[] nums) {
        long answer=0;
        for(int i=1;i<nums.length;i++)
        {
            long left=Maxi(nums,0,i);
            long mid=nums[i];
            long right=Maxi(nums,i+1,nums.length);
            long result=(left-mid)*right;
            if(result>answer)
            {
                answer=result;
            }
        }
        return answer;
    }
    public long Maxi(int[] nums,int i,int j)
    {
        long mval=Long.MIN_VALUE;
        for(int k=i;k<j;k++)
        {
            if(nums[k]>mval)
            {
                mval=nums[k];
            }
        }
        return mval;
    }
}