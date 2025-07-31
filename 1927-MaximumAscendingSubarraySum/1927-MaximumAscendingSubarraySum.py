# Last updated: 31/07/2025, 21:10:36
class Solution:
    def maxAscendingSum(self, nums: List[int]) -> int:
        s=0
        cs=nums[0]if nums else 0
        for i in range(1,len(nums)):
            if nums[i]>nums[i-1]:
                cs+=nums[i]
            else:
                s=max(s,cs)
                cs=nums[i]
        return max(s,cs)                
        