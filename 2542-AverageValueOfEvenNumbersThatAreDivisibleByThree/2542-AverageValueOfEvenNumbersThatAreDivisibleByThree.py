# Last updated: 31/07/2025, 21:08:04
class Solution:
    def averageValue(self, nums: List[int]) -> int:
        s=[]
        for i in nums:
            if i%2==0 and  i%3==0:
                s.append(i)
        if s==[]:
            return 0
        return int(sum(s)/len(s))         