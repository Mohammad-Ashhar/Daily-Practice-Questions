# Last updated: 31/07/2025, 21:18:24
class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        out = 0
        for x in nums:
            out ^= x
        return out             
        