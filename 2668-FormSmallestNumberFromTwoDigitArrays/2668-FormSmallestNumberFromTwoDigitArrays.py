# Last updated: 31/07/2025, 21:07:37
class Solution:
    def minNumber(self, nums1: List[int], nums2: List[int]) -> int:
        sn1=sorted(nums1)
        sn2=sorted(nums2)
        for i in  sn1:
            if i in sn2:
                return i
        return min(int(str(sn1[0])+str(sn2[0])),int(str(sn2[0])+str(sn1[0])))                 
        