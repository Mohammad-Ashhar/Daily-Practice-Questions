// Last updated: 31/07/2025, 21:09:20
class Solution {
    public int minSwaps(int[] nums) {
        int count = 0;
        int n = nums.length;
        for (int num : nums) {
            count += num;
        }
        int a = 0;
        for (int i = 0; i < count; i++) {
            a += 1 - nums[i];

        }
        int min = a;
        for (int i = 1; i < n; i++) {
            a -= 1 - nums[i - 1];
            a += 1 - nums[(i + count - 1) % n];
            min = Math.min(min, a);
        }
        return min;
    }
}