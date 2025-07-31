# Last updated: 31/07/2025, 21:12:50
class Solution:
    def sortByBits(self, arr: List[int]) -> List[int]:
        def count_ones(b):
            return b.count('1')
        arr.sort()
        arr=[bin(i)[2:] for i in arr]
        arr=sorted(arr,key=count_ones)
        a=[]
        for i in arr:
            a.append(int(i,2))
        return   a
        

        