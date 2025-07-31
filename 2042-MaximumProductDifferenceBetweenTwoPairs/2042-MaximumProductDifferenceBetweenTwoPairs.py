# Last updated: 31/07/2025, 21:10:15
class Solution:
    def maxProductDifference(self, nums: List[int]) -> int:
        nums.sort()
        a=nums[0]
        b=nums[1]
        c=nums[-1]
        d=nums[-2]
        return c*d -a*b