# Last updated: 31/07/2025, 21:15:54
class Solution:
    def checkSubarraySum(self, nums: List[int], k: int) -> bool:
        remainder_dict = {0: -1}
        cumulative_sum = 0
        
        for i, num in enumerate(nums):
            cumulative_sum += num
            remainder = cumulative_sum % k
            
            if remainder in remainder_dict:
                if i - remainder_dict[remainder] > 1:
                    return True
            else:
                remainder_dict[remainder] = i
        
        return False