# Last updated: 31/07/2025, 21:07:52
class Solution:
    def similarPairs(self, words: List[str]) -> int:
        l=[]
        c=0
        for i in words:
            l.append(list(set(i)))
        l=[''.join(sorted(s)) for s in l]
        for i in range(len(l)):
            for j in range(i+1,len(l)):
                if l[i]==l[j]:
                    c+=1 
        return c