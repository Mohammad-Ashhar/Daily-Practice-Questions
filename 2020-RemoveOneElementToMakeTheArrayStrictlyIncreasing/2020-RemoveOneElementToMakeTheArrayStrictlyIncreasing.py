# Last updated: 31/07/2025, 21:10:21
class Solution:
    def canBeIncreasing(self, nums: List[int]) -> bool:
        n = len(nums)
        removed = False

        for i in range(1, n):
            if nums[i] <= nums[i-1]:
                if removed:
                    return False
                removed = True
                if i >= 2 and nums[i] <= nums[i-2]:
                    if i+1 < n and nums[i+1] <= nums[i-1]:
                        return False
        return True    
        