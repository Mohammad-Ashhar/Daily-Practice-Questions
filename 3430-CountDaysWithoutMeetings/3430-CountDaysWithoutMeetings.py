# Last updated: 31/07/2025, 21:04:57
class Solution:
    def countDays(self, days: int, meetings: List[List[int]]) -> int:
        events=[]
        for i,j in meetings:
            events.append((i,1))
            events.append((j+1,-1))
        events.sort()
        m=0
        mday=0
        lastday=0
        for day,event in events:
            if m>0:
                mday+=day-lastday
            m +=event
            lastday=day
        return days-mday    




        