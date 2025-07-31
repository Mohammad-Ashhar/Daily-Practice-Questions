# Last updated: 31/07/2025, 21:06:41
class Solution:
    def numberOfPoints(self, nums: List[List[int]]) -> int:
        arr1=[0]*101
        for i in nums:
            for j in range(i[0],i[-1]+1):
                arr1[j]=1
        return sum(arr1)        

               


        
        