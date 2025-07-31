// Last updated: 31/07/2025, 21:07:45
class Solution {
    public int maximumCount(int[] nums) {
        int neg=firstNegIndex(nums);
        int pos=nums.length-firstPosIndex(nums);
        return Math.max(neg,pos);
    }
    public static int firstNegIndex(int[] nums)
    {
        int i=0,j=nums.length;
        while(i<j)
        {
            int mid=i+(j-i)/2;
            if(nums[mid]>=0)
            {
                j=mid;
            }
            else
            {
                i=mid+1;
            }
        }
        return i;
    }
    public static int firstPosIndex(int[] nums)
    {
        int i=0,j=nums.length;
        while(i<j)
        {
            int mid=i+(j-i)/2;
            if(nums[mid]>0)
            {
                j=mid;
            }
            else
            {
                i=mid+1;
            }
        }
        return i;
    }
}