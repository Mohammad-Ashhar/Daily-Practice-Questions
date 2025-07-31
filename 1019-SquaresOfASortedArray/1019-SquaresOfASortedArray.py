# Last updated: 31/07/2025, 21:14:16
class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        nums=[i*i for i in nums]
        return sorted(nums)