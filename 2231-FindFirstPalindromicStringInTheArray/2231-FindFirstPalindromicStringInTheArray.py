# Last updated: 31/07/2025, 21:09:26
class Solution:
    def firstPalindrome(self, words: List[str]) -> str:
        for i in words:
            if i==i[::-1]:
                return i
        return ""        
        