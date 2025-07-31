# Last updated: 31/07/2025, 21:08:01
class Solution:
    def applyOperations(self, nums: List[int]) -> List[int]:
        for i in range(len(nums)-1):
            if nums[i]!=nums[i+1]:
                continue
            nums[i]=2*nums[i]
            nums[i+1]=0
        return sorted(nums,key = lambda x:x==0)        

        