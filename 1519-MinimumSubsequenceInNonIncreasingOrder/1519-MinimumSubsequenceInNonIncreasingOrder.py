# Last updated: 31/07/2025, 21:12:26
class Solution:
    def minSubsequence(self, nums: List[int]) -> List[int]:
        nums.sort(reverse=True)
        ts=sum(nums)
        sub=0
        a=[]
        for i in nums:
            sub+=i
            a.append(i)
            if sub>ts-sub:
                break
        return a       
        