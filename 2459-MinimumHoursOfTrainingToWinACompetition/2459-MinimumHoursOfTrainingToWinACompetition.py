# Last updated: 31/07/2025, 21:08:29
class Solution:
    def minNumberOfHours(self, initialEnergy: int, initialExperience: int, energy: List[int], experience: List[int]) -> int:
        min_hours = 0

        sum_energy = sum(energy)
        should_be_max = sum_energy + 1

        if(should_be_max > initialEnergy):
            min_hours += should_be_max - initialEnergy

        index = 0
        while(index < len(experience)):
            if(initialExperience - experience[index] > 0):
                initialExperience += experience[index]
                index += 1
            else:
                initialExperience += 1
                min_hours += 1

        return min_hours