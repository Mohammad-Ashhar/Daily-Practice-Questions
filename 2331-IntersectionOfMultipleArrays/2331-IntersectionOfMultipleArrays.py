# Last updated: 31/07/2025, 21:08:55
class Solution:
    def intersection(self, nums: List[List[int]]) -> List[int]:
        n=len(nums)
        nums=[j for i in nums for j in i]
        dic={}
        for i in nums:
            if i in dic:
                dic[i]+=1
            else:
                dic[i]=1
        del nums
        l=[]
        for key,value in dic.items():
            if value==n:
                l.append(key)
        return sorted(l)        