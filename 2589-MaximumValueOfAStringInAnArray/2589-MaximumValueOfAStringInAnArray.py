# Last updated: 31/07/2025, 21:07:54
class Solution:
    def maximumValue(self, strs: List[str]) -> int:
        s=[]
        for i in strs:
            if i.isdigit():
                s.append(int(i))
            else:
                s.append(len(i))    
        return max(s)            