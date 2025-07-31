# Last updated: 31/07/2025, 21:11:23
class Solution:
    def frequencySort(self, nums: List[int]) -> List[int]:
        final = []
        res = []
        vis = []
        for i in nums:
            if i not in vis:
                temp = []
                temp.append(nums.count(i))
                temp.append(i)
                res.append(temp)
                vis.append(i)
        def sort_key(x):
            return (x[0], -x[1])

        res.sort(key = sort_key)
        
        for i in res:
            for j in range(i[0]):
                final.append(i[1])
        
        return final

        