# Last updated: 31/07/2025, 21:17:08
class Solution:
    def minPatches(self, nums: List[int], n: int) -> int:
        count = 0
        j = 0 
        i = 0
        while j < n: 
            if i < len(nums) and nums[i] <= j+1: 
                j += nums[i] 
                i += 1
            else:
                j += j+1
                count += 1
        return count