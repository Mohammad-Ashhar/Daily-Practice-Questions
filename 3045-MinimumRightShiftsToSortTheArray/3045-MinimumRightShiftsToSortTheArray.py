# Last updated: 31/07/2025, 21:06:35
class Solution:
    def minimumRightShifts(self, nums: List[int]) -> int:
        arrn=sorted(nums)
        n=len(nums)
        for i in range(n):
            nums=[nums[-1]]+nums[:-1]    
            if arrn==nums:
                return (i+1)%n
        return -1        





        