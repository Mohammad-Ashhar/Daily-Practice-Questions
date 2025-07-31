# Last updated: 31/07/2025, 21:16:03
class Solution:
    def findMaximizedCapital(self, k: int, w: int, profits: List[int], capital: List[int]) -> int:
        projects = sorted(zip(capital, profits))
        hp = []
        marker = 0 
        for j in range(k): 
            while marker < len(projects) and projects[marker][0] <= w: 
                heappush(hp, -projects[marker][1])
                marker += 1
            if not hp: 
                return w
            w -= heappop(hp)
        return w
                

        