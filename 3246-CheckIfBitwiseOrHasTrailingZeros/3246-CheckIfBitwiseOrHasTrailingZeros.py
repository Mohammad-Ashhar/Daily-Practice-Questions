# Last updated: 31/07/2025, 21:05:55
class Solution:
    def hasTrailingZeros(self, nums: List[int]) -> bool:
        c=0
        for i in nums:
            if i%2==0:
                c+=1   
        if c>1:
            return True
        else:
            return False