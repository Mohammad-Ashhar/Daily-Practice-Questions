# Last updated: 31/07/2025, 21:12:35
class Solution:
    def findLucky(self, arr: List[int]) -> int:
        arr.sort(reverse=True)
        for i in arr:
            if arr.count(i)==i:
                return i
        return -1                