# Last updated: 31/07/2025, 21:10:37
class Solution:
    def findCenter(self, edges: List[List[int]]) -> int:
        edges=[j for i in edges for j in i]
        dic={}
        for i in edges:
            if i in dic:
                dic[i]+=1
            else:
                dic[i]=1
        v=[]
        for key,value in dic.items():
            if value==max(dic.values()):
                return key            

        