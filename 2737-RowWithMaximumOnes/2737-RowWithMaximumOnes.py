# Last updated: 31/07/2025, 21:07:12
class Solution:
    def rowAndMaximumOnes(self, mat: List[List[int]]) -> List[int]:
        res=[0,0]
        m=0
        for i in range(len(mat)):
                if mat[i].count(1)>m:
                    m=mat[i].count(1)
                    res=[i,m]
        return res            
            
        