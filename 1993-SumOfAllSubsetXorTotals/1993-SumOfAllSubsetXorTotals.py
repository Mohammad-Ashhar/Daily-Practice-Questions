# Last updated: 31/07/2025, 21:10:24
from itertools import combinations
class Solution:
    def subsetXORSum(self, nums: List[int]) -> int:
        subsets=[]
        for r in range(len(nums)+1):
            subsets.extend(combinations(nums,r))
        subsets=list(subsets)
        a=0    
        for i in subsets:
            s=0
            for j in i:
                s^=j
            a+=s
        return a        
        