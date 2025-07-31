# Last updated: 31/07/2025, 21:07:57
class Solution:
    def appendCharacters(self, s: str, t: str) -> int:
        tptr=0
        for i in s:
            if tptr<len(t) and i ==t[tptr]:
                tptr+=1
        return len(t)-tptr               
                  