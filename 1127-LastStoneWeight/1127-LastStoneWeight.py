# Last updated: 31/07/2025, 21:13:53
class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:
        while len(stones)>1:
            stones.sort(reverse=True)
            y=stones[0]
            x=stones[1]
            if y==x:
                stones.pop(0)
                stones.pop(0)
            else:
                stones[0]=y-x
                stones.pop(1)
        return stones[0] if len(stones)==1 else 0                    