# Last updated: 31/07/2025, 21:17:00
class Solution:
    def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:
        return list(set(nums1)& set(nums2))        
        