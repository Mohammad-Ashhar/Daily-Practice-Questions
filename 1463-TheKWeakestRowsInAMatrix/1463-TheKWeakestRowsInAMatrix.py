# Last updated: 31/07/2025, 21:12:47
class Solution:
    def kWeakestRows(self, mat: List[List[int]], k: int) -> List[int]:
        dic={}
        for i in range(len(mat)):
            dic[i]=mat[i].count(1)
        dic=dict(sorted(dic.items(),key=lambda item:item[1]))
        a=[]
        for key in dic.keys():
            a.append(key)
        return a[:k]    




        