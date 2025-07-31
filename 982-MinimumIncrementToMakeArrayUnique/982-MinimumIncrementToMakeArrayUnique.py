# Last updated: 31/07/2025, 21:14:22
class Solution:
    def minIncrementForUnique(self, nums: List[int]) -> int:
        nums.sort()
        c=0
        for i in range(1,len(nums)):
            if nums[i]<=nums[i-1]:
                inc=nums[i-1]+1-nums[i]
                nums[i]+=inc
                c+=inc
        return c          
                            
        