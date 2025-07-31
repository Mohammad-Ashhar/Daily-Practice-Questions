# Last updated: 31/07/2025, 21:16:22
class Solution:
    def findContentChildren(self, g: List[int], s: List[int]) -> int:
        s.sort(reverse=True)
        g.sort(reverse=True)
        count = 0
        for i in g:
            if count < len(s) and i <= s[count]:
                count += 1
        return count        
        