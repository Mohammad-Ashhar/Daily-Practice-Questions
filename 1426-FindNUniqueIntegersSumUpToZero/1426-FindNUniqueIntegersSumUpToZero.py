# Last updated: 31/07/2025, 21:13:00
class Solution:
    def sumZero(self, n: int) -> List[int]:
        if n==1:
            return [0]
        num=[random.uniform(-1000,1000) for i in range(n-1)]
        s=sum(num)
        nn=-s
        num.append(nn)
        return num

        