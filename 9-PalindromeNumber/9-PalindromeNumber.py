# Last updated: 31/07/2025, 21:20:08
class Solution:
    def isPalindrome(self, x: int) -> bool:
        x=str(x)
        if x==x[::-1]:
            return True
        return False    
    
        