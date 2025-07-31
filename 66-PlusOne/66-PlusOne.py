# Last updated: 31/07/2025, 21:19:11
class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        s=""
        for i in digits:
            s+=str(i)
        s=str(int(s)+1)
        digits=[]
        for i in s:
            digits.append(int(i))
        return digits    


        