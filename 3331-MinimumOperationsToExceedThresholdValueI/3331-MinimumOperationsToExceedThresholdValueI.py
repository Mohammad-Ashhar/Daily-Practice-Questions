# Last updated: 31/07/2025, 21:05:34
class Solution:
    def minOperations(self, nums: List[int], k: int) -> int:
        nums.sort()
        c=0
        for i in range(len(nums)):
            if nums[i]>=k:
                break
            else:
                c+=1;
        return c            
        