# Last updated: 31/07/2025, 21:06:16
class Solution:
    def maximumStrongPairXor(self, nums: List[int]) -> int:
        l=[]
        for i in range(len(nums)):
            for j in range(i,len(nums)):
                if abs(nums[i]-nums[j])<=min(nums[i],nums[j]):
                    l.append(nums[i]^nums[j])
        return max(l)            
        