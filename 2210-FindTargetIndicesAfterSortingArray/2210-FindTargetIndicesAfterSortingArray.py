# Last updated: 31/07/2025, 21:09:32
class Solution:
    def targetIndices(self, nums: List[int], target: int) -> List[int]:
        nums.sort()
        s=[]
        for i in range(len(nums)):
            if nums[i]==target:
                s.append(i)
        return s        
        