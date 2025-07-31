// Last updated: 31/07/2025, 21:07:43
class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=ElementSum(nums);
        int digitsum=DigitSum(nums);
        return Math.abs(sum-digitsum);
    }
    public static int ElementSum(int[] nums)
    {
        int s=0;
        for(int i=0;i<nums.length;i++)
        {
            s+=nums[i];
        }
        return s;
    }
    public static int DigitSum(int[] nums)
    {
        int s=0;
        for(int i=0;i<nums.length;i++)
        {
            int num=nums[i];
            while(num!=0)
            {
                int rem=num%10;
                s+=rem;
                num/=10;
            }
        }
        return s;
    }
}