// Last updated: 31/07/2025, 21:05:53
class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int groups = n / 3;
        int[][] result = new int[groups][3];
        for (int i = 0; i < groups; i++) {
            int start = i * 3;
            int[] group = {nums[start], nums[start + 1], nums[start + 2]};
            int maxDiff = group[2] - group[0]; 
            if (maxDiff > k) {
                return new int[0][0];
            }
            result[i] = group;
        }
        return result;
    }
}