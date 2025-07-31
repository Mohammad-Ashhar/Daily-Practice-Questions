# Last updated: 31/07/2025, 21:17:30
class Solution:
    def singleNumber(self, nums: List[int]) -> List[int]:
        arr=set()
        for i in nums:
            if i in arr:
                arr.remove(i)
            else:
                arr.add(i)
        return arr            
                

        