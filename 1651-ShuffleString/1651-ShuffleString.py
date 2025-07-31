# Last updated: 31/07/2025, 21:11:39
class Solution:
    def restoreString(self, s: str, indices: List[int]) -> str:
        st=[0]*len(s)
        a=0
        for i in indices:
            st[i]=s[a]
            a+=1
        return ''.join(st)    

            
