# Last updated: 31/07/2025, 21:05:37
class Solution:
    def maxOperations(self, nums: List[int]) -> int:
        c=0
        l=len(nums)
        if l>=2:
            s=nums[0]+nums[1]
            nums.pop(0)
            nums.pop(0)
            c+=1
            l-=2
            while l>=2:
                if nums[0]+nums[1]==s:
                    c+=1
                    nums.pop(0)
                    nums.pop(0)
                    l-=2
                else:
                    break   
            
        return c        