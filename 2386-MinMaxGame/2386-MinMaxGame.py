# Last updated: 31/07/2025, 21:08:46
class Solution:
    def minMaxGame(self, nums: List[int]) -> int:
        l=len(nums)
        while l>1:
            for i in range(l//2):
                if i%2==0:
                    nums[i]=min(nums[2*i],nums[2*i+1])
                else:
                    nums[i]=max(nums[2*i],nums[2*i+1])
            l//=2
        return nums[0]                    

        