# Last updated: 31/07/2025, 21:05:26
class Solution:
    def sumOfEncryptedInt(self, nums: List[int]) -> int:
        total_sum = 0
        for num in nums:
            s = str(num)
            l = len(s)
            result = 0
            for _ in range(l):
                result = result * 10 + 1
            max_digit = max(int(digit) for digit in s)
            total_sum += max_digit * result
            
        return total_sum
