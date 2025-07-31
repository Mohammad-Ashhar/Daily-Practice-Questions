# Last updated: 31/07/2025, 21:05:43
class Solution:
    def minimumCost(self, nums: List[int]) -> int:
        min1 = nums[0]
        min2 = 100
        min3 = 100

        for num in nums[1:]:
            if num < min3:
                min2 = min3
                min3 = num
            elif num < min2:
                min2 = num
        
        return min1 + min2 + min3    

