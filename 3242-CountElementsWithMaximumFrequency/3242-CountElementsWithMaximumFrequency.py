# Last updated: 31/07/2025, 21:05:59
class Solution:
    def maxFrequencyElements(self, nums: List[int]) -> int:
        arr = []
        c = 0
        s = 0
        n=0
        while nums:
            i = nums[0]
            n = nums.count(i)
            arr.append(n)
            for _ in range(n):
                nums.remove(i)
        c = max(arr)
        s = c * arr.count(c)
        return s