# Last updated: 31/07/2025, 21:07:05
class Solution:
    def distinctDifferenceArray(self, nums: List[int]) -> List[int]:
        n=0
        n1=0
        arr=[]
        for i in range(1,len(nums)+1):
            n=len(set(nums[:i]))
            n2=len(set(nums[i:]))
            arr.append(n-n2)
        return arr    
        