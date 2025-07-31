# Last updated: 31/07/2025, 21:08:48
class Solution:
    def maximumImportance(self, n: int, roads: List[List[int]]) -> int:
        degree = [0] * n
        for road in roads:
            degree[road[0]] += 1
            degree[road[1]] += 1
        cities = list(range(n))
        cities.sort(key=lambda x: -degree[x])
        total_importance = 0
        for i in range(n):
            total_importance += (n - i) * degree[cities[i]]
        
        return total_importance