# Last updated: 31/07/2025, 21:05:15
class Solution:
    def numberOfSpecialChars(self, word: str) -> int:
        word_set = set(word)  # Create a set of characters in the word
        counted_chars = set()  # Keep track of characters already counted
        c = 0
        for char in word_set:
            if char.lower() in word_set and char.upper() in word_set and char.lower() not in counted_chars:
                counted_chars.add(char.lower())
                counted_chars.add(char.upper())
                c += 1
        return c

        