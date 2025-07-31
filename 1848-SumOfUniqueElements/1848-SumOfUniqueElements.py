# Last updated: 31/07/2025, 21:10:47
class Solution:
    def sumOfUnique(self, nums: List[int]) -> int:
        dic={}
        for i in nums:
            if i in dic:
                dic[i]+=1
            else:
                dic[i]=1
        s=0
        for key,values in dic.items():
            if values==1:
                s+=key
        return s        

        