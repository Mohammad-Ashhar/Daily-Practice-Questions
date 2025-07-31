# Last updated: 31/07/2025, 21:08:40
class Solution:
    def numberOfPairs(self, nums: List[int]) -> List[int]:
        freq={}
        for num in nums:
            if num in freq:
                freq[num]+=1
            else:
                freq[num]=1
        pair=0
        leftover=0
        for c in freq.values():
            pair+=c//2
            leftover+=c%2
        return [pair,leftover]                 



        