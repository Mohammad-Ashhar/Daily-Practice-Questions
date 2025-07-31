# Last updated: 31/07/2025, 21:16:08
class Solution:
    def findPoisonedDuration(self, timeSeries: List[int], duration: int) -> int:
        p=0
        for i in range(1,len(timeSeries)):
            if timeSeries[i]>=(timeSeries[i-1]+duration):
                p+=duration
            else:
                p+=(timeSeries[i]-timeSeries[i-1])
        return p+duration               
        