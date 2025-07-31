# Last updated: 31/07/2025, 21:12:27
class Solution:
    def minStartValue(self, nums: List[int]) -> int:
        s=0
        c=0
        for i in nums:
            c+=i
            if c<s:
                s=c
        return 1-s        


                    

        