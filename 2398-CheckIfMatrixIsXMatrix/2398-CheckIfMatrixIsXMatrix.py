# Last updated: 31/07/2025, 21:08:45
class Solution:
    def checkXMatrix(self, grid: List[List[int]]) -> bool:
        row=col=len(grid)
        for i in range(row):
            for j in range(col):
                if i==j or (i+j)==col-1:
                    if grid[i][j]==0:
                        return False
                else:
                    if grid[i][j]!=0:
                        return False    
        return True                        
        