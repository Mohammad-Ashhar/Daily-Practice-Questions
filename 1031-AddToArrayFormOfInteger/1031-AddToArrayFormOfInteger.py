# Last updated: 31/07/2025, 21:14:15
class Solution:
    def addToArrayForm(self, num: List[int], k: int) -> List[int]:
        carry = 0
        i = len(num) - 1
        result = []

        while i >= 0 or k > 0 or carry:
            if i >= 0:
                carry += num[i]
                i -= 1
            if k > 0:
                carry += k % 10
                k //= 10
            
            result.append(carry % 10)
            carry //= 10
        
        result.reverse()
        return result

