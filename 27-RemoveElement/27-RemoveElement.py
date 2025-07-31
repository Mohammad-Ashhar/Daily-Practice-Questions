# Last updated: 31/07/2025, 21:19:44
class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        c=0
        ind=0
        for i in range(len(nums)):
            if  nums[ind]==val:
                nums.pop(ind)
                nums.append("_")
                c+=1
            else:
                ind+=1    
        return len(nums)-c        


                
        