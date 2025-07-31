# Last updated: 31/07/2025, 21:07:39
class Solution:
    def vowelStrings(self, words: List[str], left: int, right: int) -> int:
        c=0
        v="aeiou"
        for i in range(left,right+1):
            if words[i][0] in v and words[i][-1] in v:
                c+=1
        return c        
        