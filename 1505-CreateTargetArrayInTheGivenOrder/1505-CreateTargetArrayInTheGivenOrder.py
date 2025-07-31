# Last updated: 31/07/2025, 21:12:32
class Solution:
    def createTargetArray(self, nums: List[int], index: List[int]) -> List[int]:
        target=[]
        temp=[]
        for i in range(len(nums)):
            temp.insert(index[i],nums[i])
        target.extend(temp)
        return target    


        