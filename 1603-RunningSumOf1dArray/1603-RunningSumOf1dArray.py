# Last updated: 31/07/2025, 21:11:56
class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        s=0
        for i in range(len(nums)):
            s+=nums[i]
            nums[i]=s
        return nums    
        