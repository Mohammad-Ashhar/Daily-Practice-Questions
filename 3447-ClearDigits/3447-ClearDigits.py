# Last updated: 31/07/2025, 21:04:59
class Solution:
    def clearDigits(self, s: str) -> str:
        a=[]
        for i in s:
            if i.isdigit():
                a.pop()
            else:
                a.append(i)
        return "".join(a)            


        