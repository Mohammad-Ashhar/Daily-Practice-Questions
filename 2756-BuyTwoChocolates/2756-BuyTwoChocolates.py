# Last updated: 31/07/2025, 21:07:10
class Solution:
    def buyChoco(self, prices: List[int], money: int) -> int:
        prices.sort()
        choco=sum(prices[0:2])
        if choco<=money:
            return money-choco
        else:
            return money                             
        