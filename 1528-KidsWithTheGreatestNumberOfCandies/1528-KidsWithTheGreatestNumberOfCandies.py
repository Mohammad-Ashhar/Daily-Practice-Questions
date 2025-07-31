# Last updated: 31/07/2025, 21:12:22
class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        m=max(candies)
        a=[]
        for i in candies:
            if i+extraCandies>=m:
                a.append(True)
            else:
                a.append(False)    
        return a