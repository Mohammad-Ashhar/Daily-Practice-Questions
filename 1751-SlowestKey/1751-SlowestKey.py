# Last updated: 31/07/2025, 21:11:13
class Solution:
    def slowestKey(self, releaseTimes: List[int], keysPressed: str) -> str:
        releaseTimes.insert(0,0)
        s=[]
        for i in range(1,len(releaseTimes)):
            s.append(releaseTimes[i]-releaseTimes[i-1])
        pairs =list(zip(keysPressed,s))
        max_pair=max(pairs,key=lambda x: (x[1],x[0]))
        return max_pair[0]




        