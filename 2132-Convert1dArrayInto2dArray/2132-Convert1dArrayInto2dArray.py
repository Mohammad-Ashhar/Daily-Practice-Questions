# Last updated: 31/07/2025, 21:09:57
class Solution:
    def construct2DArray(self, original: List[int], m: int, n: int) -> List[List[int]]:
        if len(original)!=m*n:
            return []
        a=[[0]*n for _ in range(m)]
        ind=0
        for i in range(m):
            for j in range(n):
                a[i][j]=original[ind]
                ind+=1
        return a            