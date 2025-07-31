# Last updated: 31/07/2025, 21:14:03
class Solution:
    def prefixesDivBy5(self, nums: List[int]) -> List[bool]:
        res=[]
        current=0
        for num in nums:
            current=(current<<1)|num
            res.append(current%5==0)

        return res        