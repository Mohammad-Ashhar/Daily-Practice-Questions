# Last updated: 31/07/2025, 21:14:25
class Solution:
    def diStringMatch(self, s: str) -> List[int]:
        a=[]
        d=len(s)
        i=0
        for j in s:
            if j=='I':
                a.append(i)
                i+=1
            else:
                a.append(d)
                d-=1
        a.append(i)
        return a            
        