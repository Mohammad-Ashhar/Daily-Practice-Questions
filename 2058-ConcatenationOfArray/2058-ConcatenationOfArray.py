# Last updated: 31/07/2025, 21:10:11
class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        i=2
        n=len(nums)
        ans=[0]*(2*n)
        a=0
        while i>0:
            for j in range(n):
                ans[a]=nums[j]
                a+=1
            i-=1
        return ans        
        