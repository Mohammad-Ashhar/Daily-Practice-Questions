# Last updated: 31/07/2025, 21:11:30
class Solution:
    def diagonalSum(self, mat: List[List[int]]) -> int:
        ld=[]
        rd=[]
        c=[]
        s=0
        for i in range (len(mat)):
            for j in range(len(mat)):
                if i==j:
                    c=[i,j]
                    if c not in ld :
                        ld.append(c)
                        s+=mat[i][j]
                if i+j==len(mat)-1:
                    c=[i,j]
                    if c not in ld and c not in rd:
                        rd.append(c)
                        s+=mat[i][j]
        return s               
                                            
        