# Last updated: 31/07/2025, 21:12:25
class Solution:
    def numSteps(self, s: str) -> int:
        s1=int(s,2)
        c=0
        while s1!=1:
           c+=1
           if s1%2==0:
            s1//=2
           else:
                s1+=1
        return c        

        