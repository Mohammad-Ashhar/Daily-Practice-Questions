# Last updated: 31/07/2025, 21:13:12
class Solution:
    def numberOfSubarrays(self, nums: List[int], k: int) -> int:
        def at_most_k_odds(nums, k):
            left = 0
            count = 0
            result = 0

            for right in range(len(nums)):
                if nums[right] % 2 == 1:
                    k -= 1

                while k < 0:
                    if nums[left] % 2 == 1:
                        k += 1
                    left += 1

                result += right - left + 1

            return result

        return at_most_k_odds(nums, k) - at_most_k_odds(nums, k - 1)         


