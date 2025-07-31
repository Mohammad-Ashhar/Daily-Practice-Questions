# Last updated: 31/07/2025, 21:13:50
class Solution:
    def heightChecker(self, heights: List[int]) -> int:
        newh=heights.copy()
        newh.sort()
        c=0
        for i in range(len(heights)):
            if newh[i]!=heights[i]:
                c+=1
        return c        
        