# Last updated: 31/07/2025, 21:17:53
class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        s=set()
        for i in nums:
            if i in s:
                return True
            s.add(i)
        return False            