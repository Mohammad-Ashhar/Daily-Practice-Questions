# Last updated: 31/07/2025, 21:06:55
class Solution:
    def sumOfSquares(self, nums: List[int]) -> int:
        c=0
        arr=[]
        n=len(nums)
        for i in range(n):
            if n%(i+1)==0:
                c+=nums[i]*nums[i]
        return c        
               


        