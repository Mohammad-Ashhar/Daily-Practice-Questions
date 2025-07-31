# Last updated: 31/07/2025, 21:14:30
class Solution:
    def hasGroupsSizeX(self, deck: List[int]) -> bool:
        def gcd(a, b): # find the greastest common divisor
            while b:
                a, b = b, a % b
            return a

        freq = defaultdict(int) 
        
        for i in deck:
            freq[i] += 1
            
        curr = 0
        for i in freq:
            if curr == 0: curr = freq[i]
            else: curr = gcd(curr, freq[i])
                
        return curr > 1        