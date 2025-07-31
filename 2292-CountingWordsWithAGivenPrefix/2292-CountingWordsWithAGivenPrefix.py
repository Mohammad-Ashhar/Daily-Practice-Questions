# Last updated: 31/07/2025, 21:09:12
class Solution:
    def prefixCount(self, words: List[str], pref: str) -> int:
        c=0
        for i in words:
            if i.startswith(pref):
                c+=1
        return c