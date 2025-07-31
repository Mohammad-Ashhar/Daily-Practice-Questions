# Last updated: 31/07/2025, 21:06:20
class Solution:
    def minimumSum(self, nums: List[int]) -> int:
        n=len(nums)
        c=[]
        for i in range(n):
            for j in range(i+1,n):
                for k in range(j+1,n):
                    if nums[i]<nums[j] and nums[k]<nums[j]:
                        c.append(nums[i]+nums[j]+nums[k])
                        
        if c==[]:
            return -1
        else:
            return min(c)    

        