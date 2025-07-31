# Last updated: 31/07/2025, 21:10:43
class Solution:
    def nearestValidPoint(self, x: int, y: int, points: List[List[int]]) -> int:
        dis=inf
        ind=-1
        for i,(ai,bi) in enumerate(points):
            if x==ai or y==bi:
                d=abs(x-ai)+abs(y-bi)
                if d<dis:
                    dis=d
                    ind=i
        return ind                    

        