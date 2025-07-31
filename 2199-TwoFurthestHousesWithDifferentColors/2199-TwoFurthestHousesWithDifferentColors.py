# Last updated: 31/07/2025, 21:09:35
class Solution:
    def maxDistance(self, colors: List[int]) -> int:
        m=0
        s=0
        for i in range(len(colors)):
            for j in range(i+1,len(colors)):
                if colors[i]!=colors[j]:
                    s=abs(i-j)
                    if s>m:
                        m=s
        return m                
        