# Last updated: 31/07/2025, 21:12:14
class Solution:
    def kLengthApart(self, nums: List[int], k: int) -> bool:
        d=[i for i,value in enumerate(nums) if value==1]
        for i in range(1,len(d)):
            if d[i]-d[i-1]-1<k:
                return False   
        return True        


