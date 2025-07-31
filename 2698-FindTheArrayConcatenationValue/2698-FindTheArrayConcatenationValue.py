# Last updated: 31/07/2025, 21:07:25
class Solution:
    def findTheArrayConcVal(self, nums: List[int]) -> int:
        s=0
        l,r=0,len(nums)-1
        while l<r:
            s+=int(str(nums[l])+str(nums[r]))
            l+=1
            r-=1
        if l==r:
            s+=nums[l]
        return s           



        