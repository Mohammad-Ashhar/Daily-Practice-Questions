# Last updated: 31/07/2025, 21:19:41
class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        nums.append(target)
        nums.sort()
        return nums.index(target)        

        