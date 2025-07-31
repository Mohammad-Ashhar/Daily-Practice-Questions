# Last updated: 31/07/2025, 21:09:41
class Solution:
    def smallestEqual(self, nums: List[int]) -> int:
        ar=[]
        for i in range(len(nums)):
            c=i%10
            if c==nums[i]:
                ar.append(i)
        return -1 if ar==[] else min(ar)        
        