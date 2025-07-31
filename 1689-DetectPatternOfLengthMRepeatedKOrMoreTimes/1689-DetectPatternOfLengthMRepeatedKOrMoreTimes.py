# Last updated: 31/07/2025, 21:11:27
class Solution:
    def containsPattern(self, arr: List[int], m: int, k: int) -> bool:
        for i in range(len(arr) - m * k + 1):
            pattern = arr[i:i+m]
            count = 0
            for j in range(i, i + m * k, m):
                if arr[j:j+m] == pattern:
                    count += 1
                else:
                    break
            if count == k:
                return True
        
        return False   