# Last updated: 31/07/2025, 21:11:21
class Solution:
    def numSpecial(self, mat: List[List[int]]) -> int:
        s=0
        for i in range(len(mat)):
            for j in range(len(mat[0])):
                if mat[i][j]==1:
                    if sum(mat[i])==1:
                        if sum(mat[k][j] for k in range(len(mat)))==1:
                            s+=1
        return s        
