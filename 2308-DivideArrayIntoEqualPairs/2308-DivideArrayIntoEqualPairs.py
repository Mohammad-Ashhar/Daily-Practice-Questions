# Last updated: 31/07/2025, 21:09:04
class Solution:
    def divideArray(self, nums: List[int]) -> bool:
        dic={}
        for i in (nums):
            if i in dic:
                dic[i]+=1
            else:
                dic[i]=1
        l=len(nums)
        while l>0:
            for key,value in dic.items():
                if value>=2:
                    dic[key]-=2
                    l-=2
                elif value==0:
                    continue    
                else:
                    return False
        return True            

        