# Last updated: 31/07/2025, 21:14:26
class Solution:
    def sortArrayByParityII(self, nums: List[int]) -> List[int]:
        even=[i for i in nums if i%2==0]
        odd=[i for i in nums if i%2!=0]
        a=0
        for j in range(0,len(nums),2):
            nums[j]=even[a]
            a+=1
        a=0
        for k in range(1,len(nums),2):
            nums[k]=odd[a]
            a+=1
        return nums        

        