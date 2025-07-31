# Last updated: 31/07/2025, 21:08:08
class Solution:
    def findMaxK(self, nums: List[int]) -> int:
        nums.sort()
        i,j=0,len(nums)-1
        while i<j:
            if -1*nums[i]==nums[j]:
                return nums[j]
            elif -1*nums[i]<nums[j]:
                j-=1
            else:
                i+=1
        return -1            


        