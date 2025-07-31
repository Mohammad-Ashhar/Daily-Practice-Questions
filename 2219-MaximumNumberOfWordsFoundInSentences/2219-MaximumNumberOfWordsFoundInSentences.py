# Last updated: 31/07/2025, 21:09:29
class Solution:
    def mostWordsFound(self, sentences: List[str]) -> int:
        a=[]
        for i in sentences:
            a.append(len(i.strip().split()))
        return max(a)    
        