# Last updated: 31/07/2025, 21:06:28
class Solution:
    def sumIndicesWithKSetBits(self, nums: List[int], k: int) -> int:
        arr=[bin(i)[2:].count("1") for i in range(len(nums))]
        s=0
        for j in range(len(nums)):
            if arr[j]==k:
                s+=nums[j]
        return s        
                   
   