# Last updated: 31/07/2025, 21:08:10
class Solution:
    def hardestWorker(self, n: int, logs: List[List[int]]) -> int:
        l=logs[0]
        for i in range(1,len(logs)):
            a=logs[i][1]-logs[i-1][1]
            if a>l[1] or (a==l[1] and l[0]>logs[i][0]):
                l=[logs[i][0],a]
        return l[0]        

        