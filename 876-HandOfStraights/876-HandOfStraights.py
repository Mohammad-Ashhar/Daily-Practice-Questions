# Last updated: 31/07/2025, 21:14:46
class Solution:
    def isNStraightHand(self, hand: List[int], groupSize: int) -> bool:
        n=len(hand)
        if(n%groupSize!=0):
            return False
        cnt=collections.Counter(hand)
        s=sorted(cnt)
        for c in s:
            if(cnt[c]>0):
                ng=cnt[c]
                for i in range(groupSize):
                    if cnt[c+i]<ng:
                        return False
                    cnt[c+i]-=ng
        return True                    