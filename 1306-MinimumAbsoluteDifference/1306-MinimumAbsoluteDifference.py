# Last updated: 31/07/2025, 21:13:23
class Solution:
    def minimumAbsDifference(self, arr: List[int]) -> List[List[int]]:
        arr.sort()
        mind=float('inf')
        for i in range(1,len(arr)):
            mind=min(mind,arr[i]-arr[i-1])
        a=[]
        for i in range(1,len(arr)):
            if (arr[i]-arr[i-1])==mind:
                a.append([arr[i-1],arr[i]])
        return a
        