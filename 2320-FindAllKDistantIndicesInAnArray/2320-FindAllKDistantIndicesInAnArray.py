# Last updated: 31/07/2025, 21:08:56
class Solution:
    def findKDistantIndices(self, nums: List[int], key: int, k: int) -> List[int]:
        indices = [index for index, value in enumerate(nums) if value == key]
        a=[]
        for i in indices:
            for j in range(len(nums)):
                if abs(j-i)<=k:
                    a.append(j)       
        return (list(set(a)))            