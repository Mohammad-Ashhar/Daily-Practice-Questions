# Last updated: 31/07/2025, 21:10:46
class Solution:
    def check(self, nums: List[int]) -> bool:
        nums1=nums.copy()
        nums1.sort()
        if nums1==nums:
            return True
        x=0
        a=[0]*len(nums)
        while x<len(nums):
            for i in range(len(nums)):
                a[i]=nums1[(i+x)%len(nums)]
            x+=1    
            if a==nums:
                return True
    
        return False        

        