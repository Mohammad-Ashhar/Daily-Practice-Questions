# Last updated: 31/07/2025, 21:13:41
class Solution:
    def relativeSortArray(self, arr1: List[int], arr2: List[int]) -> List[int]:
        arr=[]
        for i in range(len(arr2)):
            a=arr1.count(arr2[i])
            for j in range(a):
                arr.append(arr2[i])
                arr1.remove(arr2[i])
        arr1.sort()
        for k in arr1:
            arr.append(k)
        return arr            
        