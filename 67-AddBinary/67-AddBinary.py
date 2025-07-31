# Last updated: 31/07/2025, 21:19:03
class Solution:
    def addBinary(self, a: str, b: str) -> str:
        s=bin(int(a,2)+int(b,2))
        s=s[2:]
        return str(s)
