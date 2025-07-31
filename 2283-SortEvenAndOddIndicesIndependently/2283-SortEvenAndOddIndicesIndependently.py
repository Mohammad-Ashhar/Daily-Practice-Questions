# Last updated: 31/07/2025, 21:09:09
class Solution:
    def sortEvenOdd(self, nums: List[int]) -> List[int]:
        nums[0::2]=sorted(nums[0::2])
        nums[1::2]=sorted(nums[1::2],reverse=True)
        return nums