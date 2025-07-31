# Last updated: 31/07/2025, 21:06:57
class Solution:
    def findNonMinOrMax(self, nums: List[int]) -> int:
        nums.sort()
        if len(nums)<=2:
            return -1
        else:
            return nums[1]           
        