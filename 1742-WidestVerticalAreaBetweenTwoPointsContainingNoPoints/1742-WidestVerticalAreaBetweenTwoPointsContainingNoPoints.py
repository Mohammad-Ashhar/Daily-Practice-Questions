# Last updated: 31/07/2025, 21:11:14
class Solution:
    def maxWidthOfVerticalArea(self, points: List[List[int]]) -> int:
        points=[i[0] for i in points]
        points.sort()
        s=[]
        for i in range(1,len(points)):
            s.append(points[i]-points[i-1])
        return max(s)    
