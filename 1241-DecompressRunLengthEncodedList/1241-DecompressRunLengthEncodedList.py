# Last updated: 31/07/2025, 21:13:32
class Solution:
    def decompressRLElist(self, nums: List[int]) -> List[int]:
        a=[]
        for i in range(0,len(nums),2):
            a+=[nums[i+1]]*nums[i]
        return a           
        