# Last updated: 31/07/2025, 21:20:16
class Solution:
    def reverse(self, x: int) -> int:
        if x>0:
            s=str(x)
            s=s[::-1]
            x=int(s)
            if x>=(-2**31) and x<=(2**31-1):
                return x
            else:
                return 0    
        else:
            x*=-1
            s=str(x)
            s=s[::-1]
            x=int(s)*-1
            if x>=(-2**31) and x<=(2**31-1):
                return x
            else:
                return 0    
        