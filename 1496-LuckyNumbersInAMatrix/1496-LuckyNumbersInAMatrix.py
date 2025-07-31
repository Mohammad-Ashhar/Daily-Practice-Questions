# Last updated: 31/07/2025, 21:12:43
class Solution:
    def luckyNumbers (self, matrix: List[List[int]]) -> List[int]:
        s=set()
        a=[]   
        for row in matrix:
            s.add(min(row))
        for j in range(len(matrix[0])):
            mc=max(matrix[i][j] for i in range(len(matrix)))
            if mc in s:
                a.append(mc)
        return a           