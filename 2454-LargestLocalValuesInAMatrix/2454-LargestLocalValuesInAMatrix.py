# Last updated: 31/07/2025, 21:08:32
class Solution:
    def largestLocal(self, grid: List[List[int]]) -> List[List[int]]:
        n=len(grid)
        submatrices=[]
        for i in range(n-3+1):
            for j in range(n-3+1):
                submatrix=[row[j:j+3] for row in grid[i:i+3]]
                submatrices.append(submatrix)
        flatenned=[sum(row,[]) for row in submatrices]
        m=[[0]*(n-2) for _ in  range(n-2)]
        a=0
        for k in range(n-2):
            for l in range(n-2):
                m[k][l]=max(flatenned[a])
                a+=1
              
        return m          
        