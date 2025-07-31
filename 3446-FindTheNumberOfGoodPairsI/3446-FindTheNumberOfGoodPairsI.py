# Last updated: 31/07/2025, 21:04:56
class Solution:
    def numberOfPairs(self, nums1: List[int], nums2: List[int], k: int) -> int:
        c=0
        m,n=len(nums1),len(nums2)
        for i in range(n):
            for j in range(m):
                if nums1[j]%(nums2[i]*k)==0:
                    c+=1
        return c
        