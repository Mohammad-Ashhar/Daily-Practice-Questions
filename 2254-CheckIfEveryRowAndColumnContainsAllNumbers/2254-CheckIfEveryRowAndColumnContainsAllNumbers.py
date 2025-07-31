# Last updated: 31/07/2025, 21:09:22
class Solution:
    def checkValid(self, matrix: List[List[int]]) -> bool:
        sum_index=0
        for i in range(1,len(matrix)+1):
            for j in matrix:
                if i in j:
                    sum_index+=j.index(i)
            if sum_index==sum(range(0,len(matrix))):
                sum_index=0
            else:
                return False
        return True