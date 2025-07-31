# Last updated: 31/07/2025, 21:12:08
class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        nums.sort(reverse=True)
        return (nums[0]-1)*(nums[1]-1)       
        