// Last updated: 31/07/2025, 21:07:23
class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        int n = nums.length;
        long c = 0; 

        for (int i = 0; i < n - 1; i++) {
            int l = lower - nums[i];
            int u = upper - nums[i];
            int left = Low(nums, i + 1, n - 1, l);
            int right = Up(nums, i + 1, n - 1, u);

            if (left <= right) {
                c += (right - left + 1);
            }
        }

        return c;
    }

    public static int Low(int[] nums, int start, int end, int tar) {
        int l = start, h = end, ans = end + 1;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (nums[mid] >= tar) {
                ans = mid;
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    public static int Up(int[] nums, int start, int end, int tar) {
        int l = start, h = end, ans = start - 1;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (nums[mid] <= tar) {
                ans = mid;
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return ans;
    }
}
