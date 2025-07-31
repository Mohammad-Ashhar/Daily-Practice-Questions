# Last updated: 31/07/2025, 21:13:10
class Solution:
    def findDifference(self, nums1: List[int], nums2: List[int]) -> List[List[int]]:
        nums1=set(nums1)
        nums2=set(nums2)
        l=[]
        l.append(nums1.difference(nums2))
        l.append(nums2.difference(nums1))
        return l               
        