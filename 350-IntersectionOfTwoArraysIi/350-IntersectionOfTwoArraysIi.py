# Last updated: 31/07/2025, 21:17:03
class Solution:
    def intersect(self, nums1: List[int], nums2: List[int]) -> List[int]:
        c = Counter(nums1)
        print(c)
        res = []
        for n in nums2:
            if c[n]>0:
                res.append(n)
                c[n] -=1
        return res     