# Last updated: 31/07/2025, 21:11:01
class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        s=[]
        for i in accounts:
            s.append(sum(i))
        return max(s)    
        