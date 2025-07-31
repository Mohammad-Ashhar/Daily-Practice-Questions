# Last updated: 31/07/2025, 21:08:37
class Solution:
    def minimumOperations(self, nums: List[int]) -> int:
        s=set()
        for i in nums:
            if i!=0 and i not in s:
                s.add(i)
        return len(s)                       
