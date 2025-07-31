# Last updated: 31/07/2025, 21:08:52
class Solution:
    def findClosestNumber(self, nums: List[int]) -> int:
        result=nums[0]
        for i in nums:
            if abs(i)<abs(result):
                result=i
            if abs(i)==abs(result) and result<i:
                result=i
        return result            
        