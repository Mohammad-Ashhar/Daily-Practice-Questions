# Last updated: 31/07/2025, 21:18:14
class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        n=len(nums)/2
        dic={}
        for i in nums:
            if i not in dic:
                dic[i]=nums.count(i)
                if dic[i]>n:
                    return i


        