# Last updated: 31/07/2025, 21:09:15
class Solution:
    def findFinalValue(self, nums: List[int], original: int) -> int:
        while original in nums:
            original*=2
        return original    

        