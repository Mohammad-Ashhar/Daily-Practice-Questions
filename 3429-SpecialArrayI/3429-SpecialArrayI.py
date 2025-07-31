# Last updated: 31/07/2025, 21:05:06
class Solution:
    def isArraySpecial(self, nums: List[int]) -> bool:
        
        for i in range(len(nums)-1):
            if nums[i] % 2 == nums[i+1] % 2 :
                return False
        return True
