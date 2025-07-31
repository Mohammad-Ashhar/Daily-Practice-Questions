# Last updated: 31/07/2025, 21:11:58
class Solution:
    def average(self, salary: List[int]) -> float:
        salary.sort()
        return sum(salary[1:len(salary)-1])/(len(salary)-2)
        