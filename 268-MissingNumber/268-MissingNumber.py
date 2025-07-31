# Last updated: 31/07/2025, 21:17:29
class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        n = len(nums)
        sm_nums = sum(nums)
        sm_real = sum(range(1, n+1))
        return sm_real - sm_nums
