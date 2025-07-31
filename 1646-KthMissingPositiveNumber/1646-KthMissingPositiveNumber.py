# Last updated: 31/07/2025, 21:11:41
class Solution:
    def findKthPositive(self, arr: List[int], k: int) -> int:
        p=set(arr)
        c=0
        cu=1
        while True:
            if cu not in p:
                c+=1
                if c==k:
                    return cu
            cu+=1        

            
        