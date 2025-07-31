# Last updated: 31/07/2025, 21:08:00
class Solution:
    def distinctAverages(self, nums: List[int]) -> int:
        l=[]
        while True:
            x=min(nums)
            y=max(nums)
            z=(x+y)/2
            l.append(z)
            nums.remove(x)
            nums.remove(y)
            if len(nums)==0:
                break
        return len(set(l))        

        