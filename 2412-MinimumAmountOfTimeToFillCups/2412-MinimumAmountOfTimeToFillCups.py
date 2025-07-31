# Last updated: 31/07/2025, 21:08:42
class Solution:
    def fillCups(self, amount: List[int]) -> int:
        amount.sort()
        s=0
        while amount[2]>0:
            if amount[1]>0:
                amount[2]-=1
                amount[1]-=1
            else:
                amount[2]-=1
            amount.sort()
            s+=1
        return s            
                                           
        