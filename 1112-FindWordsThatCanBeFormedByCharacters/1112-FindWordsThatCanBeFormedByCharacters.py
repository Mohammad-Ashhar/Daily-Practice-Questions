# Last updated: 31/07/2025, 21:13:57
class Solution:
    def countCharacters(self, words: List[str], chars: str) -> int:
        char_count=Counter(chars)
        word_count=0
        s=0
        for word in words:
            word_count=Counter(word)
            if all(word_count[i] <=char_count[i] for i in word_count):
                s+=len(word)
            
        return s            
        