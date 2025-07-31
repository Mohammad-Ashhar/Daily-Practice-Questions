# Last updated: 31/07/2025, 21:14:12
class Solution:
    def findJudge(self, n: int, trust: List[List[int]]) -> int:
        if n==1:
            return 1 if not trust else -1
        trust_=[0]*(1+n)
        trust_by=[0]*(1+n)
        for a,b in trust:
            trust_[a]+=1
            trust_by[b]+=1
        for person in range(1,n+1):
            if trust_by[person]==n-1 and trust_[person]==0:
                return person
        return -1        


        