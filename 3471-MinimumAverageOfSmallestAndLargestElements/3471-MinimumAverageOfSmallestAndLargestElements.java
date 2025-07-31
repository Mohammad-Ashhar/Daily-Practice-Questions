// Last updated: 31/07/2025, 21:04:47
class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        double ma=nums[nums.length-1];
        for(int i=0;i< nums.length / 2;i++)
        {
            double avg=(nums[i]+nums[nums.length-i-1])/2.0;
            if(avg<ma)
            {
                ma=avg;
            }
        }
        return ma;
    }
}