# Last updated: 31/07/2025, 21:09:23
class Solution:
    def minimumCost(self, cost: List[int]) -> int:
        cost.sort(reverse=True)
        l=len(cost)
        if l<3:
            return sum(cost)
        s=0
        for i in range(0,l,3):
            if i==l-1:
                s+=cost[i]
            else:
                s+=cost[i]+cost[i+1]
        return s        


        