# Last updated: 31/07/2025, 21:09:45
class Solution:
    def twoOutOfThree(self, nums1: List[int], nums2: List[int], nums3: List[int]) -> List[int]:
        a=set()
        for i in nums1:
            if i in nums2 or i in nums3:
                a.add(i)
        for i in nums2:
            if i in nums1 or i in nums3:
                a.add(i)
        return list(a)                      
        