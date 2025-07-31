# Last updated: 31/07/2025, 21:10:49
class Solution:
    def countGoodRectangles(self, rectangles: List[List[int]]) -> int:
        l=[min(i) for i in rectangles]
        dic={}
        for i in l:
            if i in dic:
                dic[i]+=1
            else:
                dic[i]=1
        m=max(dic.keys())
        return dic[m]            
        