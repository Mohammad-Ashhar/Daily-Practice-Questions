# Last updated: 31/07/2025, 21:06:18
class Solution:
    def findKOr(self, nums: List[int], k: int) -> int:
        
        pos = 1
        ans = 0
        for _ in range(len(bin(max(nums))) - 2):
            count = 0
            for n in nums:
                if n & pos:
                    count += 1
                    if count == k:
                        ans += pos
                        break
            pos <<= 1
        return ans