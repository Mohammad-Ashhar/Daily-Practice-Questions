# Last updated: 31/07/2025, 21:14:14
class Solution:
    def minKBitFlips(self, nums: List[int], k: int) -> int:
        list=[0]*len(nums)
        flips=0
        for i in range(len(nums)-k+1):
            list[i]=flips
            total=list[i]
            if i-k>=0:
                total=list[i]-list[i-k]
            if nums[i]==0:
                if total%2==0:
                    flips+=1
                
            elif nums[i]==1:
                if total%2!=0:
                    flips+=1
            list[i]=flips
        for i in range(len(nums)-k+1,len(nums)):
            list[i]=flips
            total=list[i]
            if i-k>=0:
                total=list[i]-list[i-k]
            if nums[i]==0:
                if total%2==0:
                    return -1
                
            elif nums[i]==1:
                if total%2!=0:
                    return -1
            

        return flips