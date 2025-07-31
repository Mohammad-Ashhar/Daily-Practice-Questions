# Last updated: 31/07/2025, 21:13:39
class Solution:
    def findSpecialInteger(self, arr: List[int]) -> int:
        num=len(arr)*0.25
        for i in arr:
            if arr.count(i)>num:
                return i

        