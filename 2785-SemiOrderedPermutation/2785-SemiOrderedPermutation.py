# Last updated: 31/07/2025, 21:07:04
class Solution:
    def semiOrderedPermutation(self, nums: List[int]) -> int:
        n=len(nums)
        posof1=nums.index(1)
        posofn=nums.index(n)
        result=posof1+((n-1)-posofn)
        if posofn<posof1:
            result-=1
        return result        
