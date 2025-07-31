// Last updated: 31/07/2025, 21:15:37
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double maxSum = 0;
        double currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }
        maxSum = currentSum;
        for (int i = k; i < n; i++) {
            currentSum += nums[i] - nums[i - k];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }
        return maxSum / k;
    }
}