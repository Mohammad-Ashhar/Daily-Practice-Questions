# Last updated: 31/07/2025, 21:18:42
class Solution:
    def grayCode(self, n: int) -> List[int]:
        a=[]
        for i in range(1 << n):
            val = (i ^ (i >> 1))
            s = bin(val)[2::]
            a.append(int(s,2))
        return a   
