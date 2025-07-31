# Last updated: 31/07/2025, 21:19:50
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        ind=0
        l=[]
        for i in nums:
            if i not in l:
                l.append(i)
                nums[ind]=i
                ind+=1
        return len(l)           






        