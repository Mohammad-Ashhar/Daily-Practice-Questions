# Last updated: 31/07/2025, 21:06:58
class Solution:
    def countBeautifulPairs(self, nums: List[int]) -> int:
        c=0
        for i in range(len(nums)-1):
            for j in range(i+1,len(nums)):
                a=int(str(nums[i])[0])
                b=int(str(nums[j])[-1])
                if math.gcd(a,b)==1:
                    c+=1
        return c                    