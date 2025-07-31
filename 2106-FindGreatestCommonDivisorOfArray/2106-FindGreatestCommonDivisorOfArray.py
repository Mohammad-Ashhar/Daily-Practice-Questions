# Last updated: 31/07/2025, 21:10:05
class Solution:
    def findGCD(self, nums: List[int]) -> int:
        m1=max(nums)
        m2=min(nums)
        while m2:
            m1,m2=m2,m1%m2
        return m1    