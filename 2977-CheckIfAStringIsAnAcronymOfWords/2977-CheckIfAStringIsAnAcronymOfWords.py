# Last updated: 31/07/2025, 21:06:40
class Solution:
    def isAcronym(self, words: List[str], s: str) -> bool:
        return s==''.join(map(lambda x:x[0],words))   
        