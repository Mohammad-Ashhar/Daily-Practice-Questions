# Last updated: 31/07/2025, 21:06:24
class Solution:
    def sumCounts(self, nums: List[int]) -> int:
        sublist=set()
        s=0
        for i in range(len(nums)):
            for j in range(i,len(nums)):
                sublist.add(nums[j])
                s+=len(sublist)**2
            sublist.clear()    
        return s    