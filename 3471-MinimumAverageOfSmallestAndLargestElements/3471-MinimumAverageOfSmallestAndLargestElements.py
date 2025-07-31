# Last updated: 31/07/2025, 21:04:52
class Solution:
    def minimumAverage(self, nums: List[int]) -> float:
        a=[]
        n=len(nums)
        nums.sort()
        for i in range(n//2):
            a.append((nums[0]+nums[-1])/2)
            nums.pop(0)
            nums.pop(-1)
        return min(a)    
