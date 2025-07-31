# Last updated: 31/07/2025, 21:16:39
class Solution:
    def thirdMax(self, nums: List[int]) -> int:
        nums.sort(reverse=True)
        set_1=set(nums)
        nums=list(set_1)
        nums.sort(reverse=True)
        l=len(set_1)
        if l<3:
            return max(nums)
        return nums[2]     
