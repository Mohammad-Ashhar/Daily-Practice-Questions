# Last updated: 31/07/2025, 21:13:54
class Solution:
    def isBoomerang(self, points: List[List[int]]) -> bool:
        x1,y1=points[0]
        x2,y2=points[1]
        for i in range(2,len(points)):
            x3,y3=points[i]
            if (y2-y1)*(x3-x1)==(y3-y1)*(x2-x1):
                return False
        return True        