# Last updated: 31/07/2025, 21:06:01
class Solution:
    def numberGame(self, nums: List[int]) -> List[int]:
        nums.sort()
        newarr=[]
        l=len(nums)
        while l>1:
            newarr.append(nums[1])
            newarr.append(nums[0])
            nums.pop(0)
            nums.pop(0)
            l-=2
        return newarr   