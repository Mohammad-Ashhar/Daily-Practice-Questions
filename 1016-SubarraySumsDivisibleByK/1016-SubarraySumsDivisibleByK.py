# Last updated: 31/07/2025, 21:14:18
class Solution:
    def subarraysDivByK(self, nums: List[int], k: int) -> int:
        s=0
        s1=0
        s2={0:1}
        r=0
        for i, num in enumerate(nums):
            s1+=num
            r=s1%k
            if r<0:
                r+=k
            if r in s2:
                s+=s2[r]
                s2[r]+=1
            else:
                s2[r]=1
        return s                

        