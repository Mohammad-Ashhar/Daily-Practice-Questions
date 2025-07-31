# Last updated: 31/07/2025, 21:07:42
class Solution:
    def getCommon(self, nums1: List[int], nums2: List[int]) -> int:
        nums2=set(nums2)
        for i in nums1:
            if i in nums2:
                return i
        return -1                   
