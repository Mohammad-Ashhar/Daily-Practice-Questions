# Last updated: 31/07/2025, 21:07:58
class Solution:
    def unequalTriplets(self, nums: List[int]) -> int:
        s=0
        n=len(nums)
        for i in range(n):
            for j in range(i+1,n):
                for k in range(j+1,n):
                    if nums[i]!=nums[j] and nums[i]!=nums[k] and nums[j]!=nums[k]:
                        s+=1
        return s                
        