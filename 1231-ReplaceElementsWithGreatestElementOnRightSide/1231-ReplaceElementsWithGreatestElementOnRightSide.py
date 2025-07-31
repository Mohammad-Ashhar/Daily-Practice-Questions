# Last updated: 31/07/2025, 21:13:36
class Solution:
    def replaceElements(self, arr: List[int]) -> List[int]:
        n=len(arr)
        m=-1
        for i in range(n-1,-1,-1):
            c=arr[i]
            arr[i]=m
            if c>m:
                m=c    
        return arr        

        