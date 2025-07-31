# Last updated: 31/07/2025, 21:08:16
class Solution:
    def mostFrequentEven(self, nums: List[int]) -> int:
        even=[num for num in nums if num%2==0]
        if not even:
            return -1
        freq=Counter(even)
        most=min((num for num in freq if freq[num]==max(freq.values())) , key=lambda x:(freq[x],x))
        return most                       

        