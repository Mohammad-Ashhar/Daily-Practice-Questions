# Last updated: 31/07/2025, 21:07:56
class Solution:
    def deleteGreatestValue(self, grid: List[List[int]]) -> int:
        s=0
        for i in range(len(grid[0])):
            ml=[]
            m=0
            for j in grid:
                m=max(j)
                ml.append(m)
                j.remove(m)
            s+=max(ml)
        return s    



            
        