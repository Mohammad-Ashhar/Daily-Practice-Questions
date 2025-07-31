# Last updated: 31/07/2025, 21:10:22
class Solution:
    def isCovered(self, ranges: List[List[int]], left: int, right: int) -> bool:
        for i in range(left,right+1):
            present=False
            for j,k in ranges:
                if j<=i<=k:
                    present=True
                    break
            if not present:
                return False
        return True                
                    
        