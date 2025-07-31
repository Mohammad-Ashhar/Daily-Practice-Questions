# Last updated: 31/07/2025, 21:16:47
class Solution:
    def longestPalindrome(self, s: str) -> int:
        c = Counter(s)
        res = 0
        odd = False
        for i in c:
            if c[i]%2 == 0:
                res += c[i]
            else:
                res += c[i]-1
                odd = True

        return res if not odd else res+1