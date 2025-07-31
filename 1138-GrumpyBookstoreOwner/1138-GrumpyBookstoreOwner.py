# Last updated: 31/07/2025, 21:13:48
class Solution:
    def maxSatisfied(self, customers: List[int], grumpy: List[int], minutes: int) -> int:
        n = len(customers)
        total_satisfied = 0
        for i in range(n):
            if grumpy[i] == 0:
                total_satisfied += customers[i]
        additional_satisfied = 0
        current_additional = 0
        for i in range(minutes):
            if grumpy[i] == 1:
                current_additional += customers[i]
        additional_satisfied = current_additional
        for i in range(minutes, n):
            if grumpy[i - minutes] == 1:
                current_additional -= customers[i - minutes]
            if grumpy[i] == 1:
                current_additional += customers[i]
            additional_satisfied = max(additional_satisfied, current_additional)
    
        return total_satisfied + additional_satisfied           