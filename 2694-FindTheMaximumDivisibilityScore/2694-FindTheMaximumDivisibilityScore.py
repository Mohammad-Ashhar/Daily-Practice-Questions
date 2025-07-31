# Last updated: 31/07/2025, 21:07:28
class Solution:
    def maxDivScore(self, nums: List[int], divisors: List[int]) -> int:
        mx=0
        res=[]
        for each in divisors:
            tmx=0
            for i in nums:
                if i%each==0:
                    tmx+=1
            if tmx>mx:
                res=[each]
                mx=tmx
            elif tmx==mx:
                res.append(each)
                mx=tmx
        return min(res)