// Last updated: 31/07/2025, 21:18:30
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int res = 1;
        int c = 1;
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] + 1 == nums[i + 1]) {
                c++;
                res = Math.max(res, c);
            }
            if(nums[i] == nums[i + 1]) {
                continue;
            } else if(nums[i] + 1 != nums[i + 1]) {
                c = 1;
            }
        }
        return res;
}

    }
