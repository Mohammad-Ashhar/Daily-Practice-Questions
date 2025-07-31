# Last updated: 31/07/2025, 21:10:25
class Solution:
    def getMinDistance(self, nums: List[int], target: int, start: int) -> int:
        return min(abs(i-start) for i in range(len(nums)) if nums[i]==target)
        