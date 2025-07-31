# Last updated: 31/07/2025, 21:09:38
class Solution:
    def countWords(self, words1: List[str], words2: List[str]) -> int:
        s=0
        for i in words1:
            if i in words2:
                if words1.count(i)==1 and words2.count(i)==1:
                    s+=1
        return s            
        