# Last updated: 31/07/2025, 21:05:33
class Solution:
    def modifiedMatrix(self, matrix: List[List[int]]) -> List[List[int]]:
        m,n=len(matrix),len(matrix[0])
        answer = [[0 for _ in range(n)]]*m
        answer=matrix.copy()
        m_values=[-float('inf')]*n
        for j in range(n):
            for i in range(m):
                if matrix[i][j]>m_values[j]:
                    m_values[j]=matrix[i][j]            
        for k in range(m):
            for l in range(n):
                if matrix[k][l]==-1:
                    answer[k][l]=m_values[l]
                else:
                    answer[k][l]=matrix[k][l]    
        return answer            

