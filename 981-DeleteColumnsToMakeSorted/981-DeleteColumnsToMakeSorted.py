# Last updated: 31/07/2025, 21:14:23
class Solution:
    def minDeletionSize(self, strs: List[str]) -> int:
        a=0
        n=len(strs)
        if n!=len(strs[0]):
            n=len(strs[0])
        s=0
        while n>0:
            for i in range(len(strs)-1):
                if strs[i][a]<=strs[i+1][a]:
                    continue
                else:
                    s+=1
                    break
            a+=1
            n-=1
        return s                


        