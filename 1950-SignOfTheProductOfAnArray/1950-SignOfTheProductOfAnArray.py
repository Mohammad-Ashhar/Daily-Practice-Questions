# Last updated: 31/07/2025, 21:10:31
class Solution:
    def arraySign(self, nums: List[int]) -> int:
        res=nums[0]
        for i in range(1,len(nums)):
            res*=nums[i]
        if res>0:
            return 1
        elif res<0:
            return -1
        else:
            return 0           

        