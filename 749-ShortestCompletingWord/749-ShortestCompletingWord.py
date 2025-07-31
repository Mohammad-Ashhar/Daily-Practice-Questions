# Last updated: 31/07/2025, 21:15:12
class Solution:
    def shortestCompletingWord(self, licensePlate: str, words: List[str]) -> str:
        licensePlate = re.sub(r'[^a-zA-Z]', '', licensePlate.lower())
        plate_count = collections.Counter(licensePlate)
        shortest_word = None
        shortest_length = float('inf')
        for word in words:
            word_count = collections.Counter(word)
            if all(word_count[char] >= plate_count[char] for char in plate_count):
                if len(word) < shortest_length:
                    shortest_word = word
                    shortest_length = len(word)
        
        return shortest_word

        