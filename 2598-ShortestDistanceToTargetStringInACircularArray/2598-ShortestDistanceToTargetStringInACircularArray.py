# Last updated: 31/07/2025, 21:07:49
class Solution:
    def closetTarget(self, words: List[str], target: str, startIndex: int) -> int:
        if target not in words:
            return -1
        f1=words[startIndex:]+words[:startIndex]
        b1=words[startIndex::-1]+words[:startIndex:-1]
        fc=f1.index(target)
        bc=b1.index(target)
        return min(fc,bc)    
        