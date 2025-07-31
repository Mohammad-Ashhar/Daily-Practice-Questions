# Last updated: 31/07/2025, 21:10:34
class Solution:
    def minOperations(self, nums: List[int]) -> int:
        s=0
        for i in range(1,len(nums)):
            if nums[i]<=nums[i-1]:
                inc=nums[i-1]-nums[i]+1
                nums[i]+=inc
                s+=inc
        return s        