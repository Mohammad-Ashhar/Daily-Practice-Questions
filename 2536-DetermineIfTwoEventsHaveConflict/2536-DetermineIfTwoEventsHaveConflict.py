# Last updated: 31/07/2025, 21:08:05
class Solution:
    def haveConflict(self, event1: List[str], event2: List[str]) -> bool:
        e1t1=int(event1[0][:2]+event1[0][3:])
        e1t2=int(event1[1][:2]+event1[1][3:])
        e2t1=int(event2[0][:2]+event2[0][3:])
        e2t2=int(event2[1][:2]+event2[1][3:])
        if e1t2<e2t1 or e2t2<e1t1:
            return False
        else:
            return True    
