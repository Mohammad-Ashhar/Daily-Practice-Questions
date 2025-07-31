// Last updated: 31/07/2025, 21:15:40
class Solution {
    public int maximumProduct(int[] nums) {
        int n=nums.length;

        Arrays.sort(nums);

        int ans=Math.max(nums[0]*nums[1]*nums[n-1], nums[n-1]*nums[n-2]*nums[n-3]);
        return ans;   
    }
}