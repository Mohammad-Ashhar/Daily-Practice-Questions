# Last updated: 31/07/2025, 21:13:18
class Solution:
    def checkStraightLine(self, coordinates: List[List[int]]) -> bool:
        (x0,y0),(x1,y1) = coordinates[:2]
        for x, y in coordinates[2:]:
            if(y1-y0)*(x-x0) != (y-y0)*(x1-x0):
                return False
        return True        


        