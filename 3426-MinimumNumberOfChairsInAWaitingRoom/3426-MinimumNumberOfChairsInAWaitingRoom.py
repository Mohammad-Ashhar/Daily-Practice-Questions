# Last updated: 31/07/2025, 21:05:10
class Solution:
    def minimumChairs(self, s: str) -> int:
        st=0
        a=[]
        for i in s:
            if i=='E':
                st+=1
                a.append(st)
            elif i=='L':
                if st>0:
                    st-=1
                a.append(st)    
        return max(a)            

        