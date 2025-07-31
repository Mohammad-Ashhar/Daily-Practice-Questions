# Last updated: 31/07/2025, 21:13:42
class Solution:
    def trimMean(self, arr: List[int]) -> float:
        arr.sort()
        a=int(0.05*len(arr))
        s=sum(arr[a:len(arr)-a])
        t=(len(arr)-(2*a))
        st=s/t
        return round(st,5)   
        