# Last updated: 31/07/2025, 21:12:58
class Solution:
    def getAncestors(self, n: int, edges: List[List[int]]) -> List[List[int]]:
        dic=defaultdict(list)
        res=[]
        for i,j in edges:
            dic[i].append(j)
            if i not in res:
                res.append(i)
            if j not in res:
                res.append(j)
        result=[[] for i in range(n)]
        def dfs(start,val):
            if start not in dic:
                return
            for i in dic[start]:
                if i not in self.visited:
                    result[i].append(val)
                    self.visited.append(i)
                    dfs(i,val)
            return
        for j in range(n):
            self.visited=[]
            dfs(j,j)
        return result