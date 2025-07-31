# Last updated: 31/07/2025, 21:10:07
class Solution:
    def isPrefixString(self, s: str, words: List[str]) -> bool:
        s1=""
        for i in words:
            s1+=i
            if s1==s:
                return True
        return False        