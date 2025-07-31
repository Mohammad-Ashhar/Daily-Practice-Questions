# Last updated: 31/07/2025, 21:09:59
class Solution:
    def maximumDifference(self, nums: List[int]) -> int:
        n=len(nums)
        d=[]
        for i in range(n):
            for j in range(i+1,n):
                if nums[i]<nums[j]:
                    d.append(nums[j]-nums[i])
        return -1 if d==[] else max(d)            
        