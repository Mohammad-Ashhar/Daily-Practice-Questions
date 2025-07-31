# Last updated: 31/07/2025, 21:10:08
class Solution:
    def findMiddleIndex(self, nums: List[int]) -> int:
        n=len(nums)
        total=sum(nums)
        left_sum=0
        for i in range(n):
            right_sum=total - left_sum - nums[i]
            if left_sum==right_sum:
                return i
            left_sum+=nums[i]    
        return -1
        