// Last updated: 31/07/2025, 21:05:52
class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq=new int[101];
        for(int i=0;i<nums.length;i++)
        {
            freq[nums[i]]++;
        }
        int max=0;
        for(int f:freq)
        {
            max=Math.max(f,max);
        }
        int c=0;
        for(int f:freq)
        {
            if(f==max)
            {
                c++;
            }
        }
        return c*max;
    }
}