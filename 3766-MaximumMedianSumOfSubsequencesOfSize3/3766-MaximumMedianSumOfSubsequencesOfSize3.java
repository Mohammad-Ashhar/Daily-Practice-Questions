// Last updated: 31/07/2025, 21:04:17
class Solution {
    public long maximumMedianSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int k=n/3;
        long ans=0;
        int left=n;
        for(int i=0;i<k;i++)
            {
                left-=2;
                ans+=nums[left];
            }
        return ans;
        
    }
}