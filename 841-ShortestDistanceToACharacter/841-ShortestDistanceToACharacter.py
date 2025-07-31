# Last updated: 31/07/2025, 21:14:54
class Solution:
    def shortestToChar(self, s: str, c: str) -> List[int]:
        n = len(s)
        result = [n] * n  # Initialize result with a large number

        # Find all positions of character c in s
        positions = []
        for i in range(n):
            if s[i] == c:
                positions.append(i)

        # First pass: left to right
        for i in range(n):
            for pos in positions:
                result[i] = min(result[i], abs(i - pos))

        # Second pass: right to left
        for i in range(n - 1, -1, -1):
            for pos in positions:
                result[i] = min(result[i], abs(i - pos))

        return result