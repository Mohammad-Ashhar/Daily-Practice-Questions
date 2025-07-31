# Last updated: 31/07/2025, 21:16:26
class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
        arr=set(nums)
        a=[]
        for i in range(1,len(nums)+1):
            if i not in arr:
                a.append(i)
        return a        