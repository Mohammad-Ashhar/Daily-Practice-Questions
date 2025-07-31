# Last updated: 31/07/2025, 21:05:27
class Solution:
    def scoreOfString(self, s: str) -> int:
        su=0
        for i in range(len(s)-1):
            su+=abs(ord(s[i])-ord(s[i+1]))
        return su    

        