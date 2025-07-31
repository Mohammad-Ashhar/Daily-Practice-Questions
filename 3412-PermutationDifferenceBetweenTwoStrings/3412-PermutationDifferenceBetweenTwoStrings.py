# Last updated: 31/07/2025, 21:05:13
class Solution:
    def findPermutationDifference(self, s: str, t: str) -> int:
        su=0
        for i in range(len(s)):
            su+=abs(i-t.index(s[i]))
        return su    

        