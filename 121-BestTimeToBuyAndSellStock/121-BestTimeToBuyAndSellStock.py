# Last updated: 31/07/2025, 21:18:41
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        if not prices:
            return 0
        min_price = prices[0]
        max_profit = 0
        for price in prices:
            if price < min_price:
                min_price = price
            potential_profit = price - min_price
            if potential_profit > max_profit:
                max_profit = potential_profit
        return max_profit         

        