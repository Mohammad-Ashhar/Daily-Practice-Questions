# Last updated: 31/07/2025, 21:15:47
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        # Sum the elements at even indices (0-based)
        return sum(nums[i] for i in range(0, len(nums), 2))