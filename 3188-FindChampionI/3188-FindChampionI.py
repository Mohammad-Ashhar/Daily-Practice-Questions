# Last updated: 31/07/2025, 21:06:17
class Solution:
    def findChampion(self, grid: List[List[int]]) -> int:
        ind=0
        m=0
        c=0
        for i in range(len(grid)):
            c=grid[i].count(1)
            if c>m:
                m=c
                ind=(i)
        return ind        

        