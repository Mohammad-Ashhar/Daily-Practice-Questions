# Last updated: 31/07/2025, 21:06:52
class Solution:
    def maximumNumberOfStringPairs(self, words: List[str]) -> int:
        c=0
        n=len(words)
        for i in range(n):
            for j in range(i+1,n):
                if words[i]==words[j][::-1]:

                    c+=1
        return c            
        