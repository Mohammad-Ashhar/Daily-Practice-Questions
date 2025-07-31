# Last updated: 31/07/2025, 21:12:09
class Solution:
    def finalPrices(self, prices: List[int]) -> List[int]:
        for i in range(len(prices)-1):
            for j in range(i+1,len(prices)):
                if prices[j]<=prices[i]:
                    prices[i]-=prices[j]
                    break
        return prices            
        