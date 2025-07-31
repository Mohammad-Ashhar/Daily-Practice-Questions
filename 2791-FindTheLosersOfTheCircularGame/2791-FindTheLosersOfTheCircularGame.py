# Last updated: 31/07/2025, 21:07:02
class Solution:
    def circularGameLosers(self, n: int, k: int) -> List[int]:
        rec,i,t=[],0,1
        while True:
            if i in rec:
                break
            rec.append(i)
            i=(i+(k*t))%n
            t+=1
        op=[]
        for i in range(n):
            if i not in rec:
                op.append(i+1)
        return op                




        