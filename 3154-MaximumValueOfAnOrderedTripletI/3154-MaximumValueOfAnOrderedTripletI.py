# Last updated: 31/07/2025, 21:06:30
class Solution:
    def maximumTripletValue(self, nums: List[int]) -> int:
        ans=0
        for i in range(1,len(nums)-1):
            left=max(nums[:i])
            middle=nums[i]
            right=max(nums[i+1:])
            res=(left-middle)*right
            if res>ans:
                ans=res
        return ans                           
        