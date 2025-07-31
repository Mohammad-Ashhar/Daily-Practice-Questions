# Last updated: 31/07/2025, 21:07:51
class Solution:
    def maximumCount(self, nums: List[int]) -> int:
        pos,neg=0,0
        for i in nums:
            if i>0:
                pos+=1
            if i<0:
                neg+=1
        return max(pos,neg)            
        