# Last updated: 31/07/2025, 21:06:48
class Solution:
    def numberOfEmployeesWhoMetTarget(self, hours: List[int], target: int) -> int:
        c=0
        for i in hours:
            if i>=target:
                c+=1
        return c        
        