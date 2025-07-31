# Last updated: 31/07/2025, 21:06:51
class Solution:
    def longestAlternatingSubarray(self, nums: List[int], threshold: int) -> int:
        res = 0
        curr = 0
        def isalternating(nums, i):
            return nums[i-1] % 2 != nums[i] % 2
                   
        i = 0       
        while i < len(nums):
            if not curr:  
                if nums[i] % 2 == 0 and nums[i] <= threshold:
                    curr = 1
                    res = max(curr, res) 
                    
                i += 1
                continue
            
            if isalternating(nums, i) and nums[i] <= threshold:
                curr += 1
                res = max(curr, res)
                i += 1
            else:
                curr = 0
             
        return res                                              
        