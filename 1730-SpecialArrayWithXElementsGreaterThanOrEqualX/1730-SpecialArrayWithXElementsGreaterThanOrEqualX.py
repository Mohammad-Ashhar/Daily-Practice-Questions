# Last updated: 31/07/2025, 21:11:16
class Solution:
    def specialArray(self, nums: List[int]) -> int:
        for i in range(len(nums),0,-1):
            if [num>=i for num in nums].count(True)==i:
                return i
        return -1        
        