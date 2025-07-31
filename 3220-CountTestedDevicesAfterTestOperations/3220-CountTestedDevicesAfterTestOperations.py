# Last updated: 31/07/2025, 21:06:11
class Solution:
    def countTestedDevices(self, batteryPercentages: List[int]) -> int:
        c=0
        for i in range(len(batteryPercentages)):
            if batteryPercentages[i]>0:
                c+=1
                for j in range(i+1,len(batteryPercentages)):
                    if batteryPercentages[j]<=0:
                        batteryPercentages[j]=0
                    else:
                        batteryPercentages[j]=batteryPercentages[j]-1
        return c                 
                         
                      

