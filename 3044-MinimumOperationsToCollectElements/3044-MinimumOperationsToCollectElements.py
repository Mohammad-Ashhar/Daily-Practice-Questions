# Last updated: 31/07/2025, 21:06:38
class Solution:
    def minOperations(self, nums: List[int], k: int) -> int:
        arr1=[]
        c1=0
        c2=0
        for i in range(k):
            arr1.append(i+1)
        for j in range(len(nums)-1,-1,-1):
            if len(arr1)>0:
                if nums[j] in arr1:
                    c1+=1
                    arr1.remove(nums[j])
                
                else:
                    c2+=1
                        
        return c1+c2           



                     

        