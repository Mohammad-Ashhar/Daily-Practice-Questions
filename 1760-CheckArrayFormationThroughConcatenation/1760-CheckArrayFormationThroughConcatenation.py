# Last updated: 31/07/2025, 21:11:09
class Solution:
    def canFormArray(self, arr: List[int], pieces: List[List[int]]) -> bool:
        array_length = len(arr)
        for piece in pieces:
            i, j, piece_length = 0, 0, len(piece)
            while j < array_length and arr[j] != piece[i]:
                j += 1
            if j == len(arr):
                return False
            if arr[j: j+piece_length] != piece:
                return False
        return True