# Last updated: 31/07/2025, 21:14:55
class Solution:
    def maxProfitAssignment(self, difficulty: List[int], profit: List[int], worker: List[int]) -> int:
        jobs = sorted(zip(difficulty, profit))
        max_profit = 0
        max_profit_so_far = 0
    
        for ability in sorted(worker):
            while jobs and ability >= jobs[0][0]:
                max_profit_so_far = max(max_profit_so_far, jobs.pop(0)[1])
        
            max_profit += max_profit_so_far
    
        return max_profit