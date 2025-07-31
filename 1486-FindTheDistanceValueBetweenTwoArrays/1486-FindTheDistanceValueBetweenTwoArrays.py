# Last updated: 31/07/2025, 21:12:39
class Solution:
    def findTheDistanceValue(self, arr1: List[int], arr2: List[int], d: int) -> int:
        f=0
        for i in range(len(arr1)):
            c=0
            for j in range(len(arr2)):
                if abs(arr1[i]-arr2[j])<=d:
                    break
                else:
                    c+=1
            if c==len(arr2):
                f+=1        
        return f            

        